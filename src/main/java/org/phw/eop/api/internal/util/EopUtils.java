package org.phw.eop.api.internal.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.phw.eop.api.ApiException;
import org.phw.eop.api.Constants;

/**
 * 系统工具类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public abstract class EopUtils {
    /**
     * 给EOP请求签名。
     * @param signAlgorithm 
     * 
     * @param signKey 签名密钥
     * @return 签名
     * @throws IOException
     */
    public static Pair<String, String> signEopRequest(String signAlgorithm, EopMap actionParams, String signKey)
            throws IOException {

        StringBuilder query = new StringBuilder();

        // 第一步：把字典按Key的字母顺序排序
        Map<String, String> sortedParams = new TreeMap<String, String>();
        if (actionParams != null && actionParams.size() > 0) {
            sortedParams.putAll(actionParams);
        }

        Set<Entry<String, String>> paramSet = sortedParams.entrySet();

        // 第二步：把所有参数名和参数值串在一起
        for (Entry<String, String> param : paramSet) {
            if (StringUtils.areNotEmpty(param.getKey(), param.getValue())) {
                query.append('$').append(param.getKey()).append('$').append(param.getValue());
            }
        }

        String signInfo = query.toString();
        // 第三步：使用MD5计算签名
        byte[] bytes = "hmac".equalsIgnoreCase(signAlgorithm)
                ? hmac(signKey, signInfo)
                : md5(signKey + signInfo + signKey);

        // 第四步：把二进制转化为大写的十六进制
        return Pair.makePair(Base64.encodeToString(bytes, false), signInfo);
    }

    private static final String KEY_MAC = "HmacMD5";

    private static byte[] hmac(String signKey, String string) throws IOException {
        SecretKeySpec secretKey = new SecretKeySpec(Base64.decode(signKey), KEY_MAC);
        try {
            Mac mac = Mac.getInstance(secretKey.getAlgorithm());
            mac.init(secretKey);
            return mac.doFinal(ByteUtils.toBytes(string));
        }
        catch (Exception e) {
            throw new IOException(e);
        }
    }

    private static byte[] md5(String data) throws IOException {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return md.digest(data.getBytes(Constants.CHARSET_UTF8));
        }
        catch (GeneralSecurityException gse) {
            throw new IOException(gse);
        }
    }

    public static String createEopCipher(String aeskey, String... kvs) throws Exception {
        StringBuilder query = new StringBuilder();

        for (int i = 0; i < kvs.length; i += 2) {
            String name = kvs[i];
            String value = i + 1 < kvs.length ? kvs[i + 1] : null;
            // 忽略参数名或参数值为空的参数
            if (!StringUtils.areNotEmpty(name, value)) {
                continue;
            }

            if (i > 0) {
                query.append("&");
            }

            try {
                query.append(URLEncoder.encode(name, "UTF-8"))
                        .append("=").append(URLEncoder.encode(value, "UTF-8"));
            }
            catch (UnsupportedEncodingException e) {
                // keep silent.
            }
        }

        return AesUtils.encrypt(query.toString(), aeskey);

    }

    public static String createSecuret(String paramAlgorithm, String paramKey, String value) throws ApiException {
        try {
            if ("AES".equals(paramAlgorithm)) {
                return AesUtils.encrypt(value, paramKey);
            }
        }
        catch (Exception e) {
            throw new ApiException(e);
        }
        return null;
    }

    public static String createQueryString(EopMap securetKeyValueParams) {
        StringBuilder query = new StringBuilder();
        Set<Entry<String, String>> entrySet = securetKeyValueParams.entrySet();
        for (Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            // 忽略参数名或参数值为空的参数
            if (!StringUtils.areNotEmpty(key, value)) {
                continue;
            }

            if (query.length() > 0) {
                query.append("&");
            }

            try {
                query.append(URLEncoder.encode(key, "UTF-8"))
                        .append("=").append(URLEncoder.encode(value, "UTF-8"));
            }
            catch (UnsupportedEncodingException e) {
                // keep silent.
            }
        }
        return query.toString();
    }

    /**
     * 获取一个类指定的属性（遍历父类）
     * @param clazz
     * @param fieldName
     * @return
     */
    public static Field getDeclaredField(Class clazz, String fieldName) {
        Field field = null;
        while (clazz != null && field == null) {
            try {
                field = clazz.getDeclaredField(fieldName);
            }
            catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
                continue;
            }
        }
        return field;
    }

    /**
     * 获取一个类所有的属性（遍历父类）
     * @param clazz
     * @return
     */
    public static List<Field> getDeclaredField(Class clazz) {
        List<Field> fieldList = new ArrayList<Field>();
        while (clazz != null) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                fieldList.add(field);
            }
            clazz = clazz.getSuperclass();
        }
        return fieldList;
    }

    /**
     * Map塞值。
     * @param map 目标Map。
     * @param key Key。
     * @param val Value。
     * @param nullPut Value为null时是否继续。
     */
    public static void putMap(Map map, String key, Object val, boolean nullPut) {
        if (map == null || key == null) {
            return;
        }
        if (val == null && !nullPut) {
            return;
        }
        map.put(key, val == null ? "" : val);
    }

}
