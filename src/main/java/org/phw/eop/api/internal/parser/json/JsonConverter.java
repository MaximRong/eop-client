package org.phw.eop.api.internal.parser.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.phw.eop.api.ApiException;
import org.phw.eop.api.EopRsp;
import org.phw.eop.api.Rsp;
import org.phw.eop.api.internal.mapping.Converter;
import org.phw.eop.api.internal.mapping.Converters;
import org.phw.eop.api.internal.mapping.Reader;

import com.alibaba.fastjson.JSON;

/**
 * JSON格式转换器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class JsonConverter implements Converter {
    public static JSON parseJSON(String rsp) {
        try {
            return JSON.parseObject(rsp);
        }
        catch (Throwable ex) {

        }

        //        try {
        //            return JSON.parseArray(rsp);
        //        }
        //        catch (Throwable ex) {
        //
        //        }

        return null;
    }

    @Override
    public <T extends Rsp> T toResponse(String rsp, Class<T> clazz) throws ApiException {
        JSON rootObj = parseJSON(rsp);
        if (rootObj instanceof Map<?, ?>) {
            T rspObject;
            try {
                rspObject = clazz.newInstance();
            }
            catch (Exception e) {
                throw new ApiException(e);
            }

            Map<?, ?> rootJson = (Map<?, ?>) rootObj;
            rspObject.setRspcode((String) rootJson.get("rspcode"));
            rspObject.setRspdesc((String) rootJson.get("rspdesc"));
            rspObject.setTrxid((String) rootJson.get("trxid"));
            Object rspMsgObj = rootJson.get("rspmsg");
            Object object = parseJSON(JSON.toJSONString(rspMsgObj));
            if (object instanceof Map) {
                this.fromJson((Map) object, rspObject);
            }
            else if (object instanceof List) {
                HashMap hashMap = new HashMap();
                hashMap.put("items", object);
                this.fromJson(hashMap, rspObject);
            }

            rspObject.setRspmsg(rspMsgObj.toString());

            return rspObject;
        }
        return null;
    }

    /**
     * 把JSON格式的数据转换为对象。
     * 
     * @param <T> 泛型领域对象
     * @param json JSON格式的数据
     * @param clazz 泛型领域类型
     * @return 领域对象
     * @throws EOPException
     */
    public <T> void fromJson(final Map<?, ?> json, T rsp) throws ApiException {
        if (rsp instanceof EopRsp) {
            EopRsp eopRsp = (EopRsp) rsp;
            eopRsp.setResult(json);
            return;
        }

        Converters.convert(rsp, new Reader() {
            @Override
            public boolean hasReturnField(Object name) {
                return json.containsKey(name);
            }

            @Override
            public Object getPrimitiveObject(Object name) {
                return json.get(name);
            }

            @Override
            public Object getObject(Object name, Class<?> type) throws ApiException {
                Object tmp = json.get(name);
                if (tmp instanceof Map<?, ?>) {
                    Map<?, ?> map = (Map<?, ?>) tmp;
                    Object newInstance;
                    try {
                        newInstance = type.newInstance();
                    }
                    catch (Exception e) {
                        throw new ApiException(e);
                    }
                    JsonConverter.this.fromJson(map, newInstance);
                    return newInstance;
                }
                return null;
            }

            @Override
            public List<?> getListObjects(Object itemName, Class<?> subType) throws ApiException {
                List<Object> listObjs = null;

                Object listTmp = json.get(itemName);
                if (listTmp == null) {
                    return null;
                }
                List<Object> tmpList = new ArrayList<Object>();
                if (!(listTmp instanceof List<?>)) {
                    tmpList.add(listTmp);
                }
                else {
                    tmpList = (List<Object>) listTmp;
                }

                listObjs = new ArrayList<Object>();
                for (Object subTmp : tmpList) {
                    if (subTmp == null) {
                        continue;
                    }
                    if (subTmp instanceof Map<?, ?>) {// object
                        Map<?, ?> subMap = (Map<?, ?>) subTmp;
                        Object subObj = null;
                        try {
                            subObj = subType.newInstance();
                        }
                        catch (Exception e) {
                            throw new ApiException(e);
                        }
                        JsonConverter.this.fromJson(subMap, subObj);
                        listObjs.add(subObj);
                    }
                    else if (subTmp instanceof List<?>) {// array
                        // TODO not support yet
                    }
                    else {// boolean, long, double, string
                        listObjs.add(subTmp);
                    }
                }

                return listObjs;
            }

            @Override
            public Object getMappedOutObject(Class<?> type) throws ApiException {
                // TODO Auto-generated method stub
                return null;
            }
        });
    }

}
