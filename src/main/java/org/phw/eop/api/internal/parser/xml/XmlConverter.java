package org.phw.eop.api.internal.parser.xml;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.phw.eop.api.ApiException;
import org.phw.eop.api.Constants;
import org.phw.eop.api.EopRsp;
import org.phw.eop.api.Rsp;
import org.phw.eop.api.internal.mapping.Converter;
import org.phw.eop.api.internal.mapping.Converters;
import org.phw.eop.api.internal.mapping.Reader;
import org.phw.eop.api.internal.util.XmlUtils;
import org.w3c.dom.Element;

/**
 * JSON格式转换器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class XmlConverter implements Converter {

    @Override
    public <T extends Rsp> T toResponse(String rsp, Class<T> clazz) throws ApiException {
        Element root = XmlUtils.getRootElementFromString(rsp);
        T rspObject;
        try {
            rspObject = clazz.newInstance();
        }
        catch (Exception e) {
            throw new ApiException(e);
        }

        rspObject.setRspcode(XmlUtils.getElementValue(root, "rspcode"));
        rspObject.setRspdesc(XmlUtils.getElementValue(root, "rspdesc"));
        rspObject.setTrxid(XmlUtils.getElementValue(root, "trxid"));

        final Element rspmsg = XmlUtils.getChildElement(root, "rspmsg");
        if (rspmsg != null) {
            this.getModelFromXML(rspmsg, rspObject);
        }

        return rspObject;
    }

    private <T> void getModelFromXML(final Element element, T rspObject) throws ApiException {
        if (element == null) {
            return;
        }
        if (rspObject instanceof EopRsp) {
            EopRsp eopRsp = (EopRsp) rspObject;
            eopRsp.setResult(XmlUtils.dom2Map(element));
            return;
        }

        Converters.convert(rspObject, new Reader() {
            @Override
            public boolean hasReturnField(Object name) {
                Element childE = XmlUtils.getChildElement(element, (String) name);
                return childE != null;
            }

            @Override
            public Object getPrimitiveObject(Object name) {
                return XmlUtils.getElementValue(element, (String) name);
            }

            @Override
            public Object getObject(Object name, Class<?> type) throws ApiException {
                Element childE = XmlUtils.getChildElement(element, (String) name);
                if (childE != null) {
                    Object newInstance;
                    try {
                        newInstance = type.newInstance();
                    }
                    catch (Exception e) {
                        throw new ApiException(e);
                    }
                    XmlConverter.this.getModelFromXML(childE, newInstance);
                    return newInstance;
                }
                return null;
            }

            @Override
            public List<?> getListObjects(Object itemName, Class<?> subType) throws ApiException {
                String tagName = (String) itemName;
                List<Object> list = null;
                Element listE = XmlUtils.getElement(element, tagName);
                List<Element> itemEs = null;
                if (listE == null) {
                    itemEs = XmlUtils.getChildElements(element, tagName);
                }
                else {
                    itemEs = XmlUtils.getChildElements(listE, tagName);
                }

                if (itemEs != null) {
                    list = new ArrayList<Object>();
                    for (Element itemE : itemEs) {
                        Object obj = null;
                        String value = XmlUtils.getElementValue(itemE);

                        if (String.class.isAssignableFrom(subType)) {
                            obj = value;
                        }
                        else if (Long.class.isAssignableFrom(subType)) {
                            obj = Long.valueOf(value);
                        }
                        else if (Integer.class.isAssignableFrom(subType)) {
                            obj = Integer.valueOf(value);
                        }
                        else if (Boolean.class.isAssignableFrom(subType)) {
                            obj = Boolean.valueOf(value);
                        }
                        else if (Date.class.isAssignableFrom(subType)) {
                            DateFormat format = new SimpleDateFormat(Constants.DATE_TIME_FORMAT);
                            try {
                                obj = format.parse(value);
                            }
                            catch (ParseException e) {
                                throw new ApiException(e);
                            }
                        }
                        else {
                            try {
                                obj = subType.newInstance();
                            }
                            catch (Exception e) {
                                throw new ApiException(e);
                            }
                            XmlConverter.this.getModelFromXML(itemE, obj);
                        }
                        if (obj != null) {
                            list.add(obj);
                        }
                    }
                }
                return list;
            }

            @Override
            public Object getMappedOutObject(Class<?> type) throws ApiException {
                // TODO Auto-generated method stub
                return null;
            }
        });
    }
}
