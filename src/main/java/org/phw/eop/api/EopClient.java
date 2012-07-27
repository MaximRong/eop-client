package org.phw.eop.api;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Map.Entry;

import org.phw.eop.api.internal.parser.json.ObjectJsonParser;
import org.phw.eop.api.internal.parser.xml.ObjectXmlParser;
import org.phw.eop.api.internal.util.ByteUtils;
import org.phw.eop.api.internal.util.EopLogger;
import org.phw.eop.api.internal.util.EopMap;
import org.phw.eop.api.internal.util.EopUtils;
import org.phw.eop.api.internal.util.HttpRsp;
import org.phw.eop.api.internal.util.Pair;
import org.phw.eop.api.internal.util.StringUtils;
import org.phw.eop.api.internal.util.WebUtils;

import com.sun.org.apache.xml.internal.security.utils.Base64;

/**
 * 基于REST的EOP客户端。
 * 
 */
public class EopClient {
    private String serverUrl;
    private String appcode;
    private String signKey;
    private String signAlgorithm = "MD5";
    private String paramKey;
    private String paramAlgorithm = "AES";
    private String fmt;
    private boolean sign = true;

    private int connectTimeout = 0;
    private int readTimeout = 0;
    private Proxy proxy;
    private String proxyAuthorization;

    public EopClient(String serverUrl, String appcode, String signKey) {
        this.serverUrl = serverUrl;
        this.appcode = appcode;
        this.signKey = signKey;
    }

    public void setProxy(String proxyHost, int proxyPort) {
        // Refre: http://www.rgagnon.com/javadetails/java-0085.html
        proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
    }

    public void setProxyAuthorization(String userName, String password) {
        // uc.setRequestProperty("Proxy-Authorization", "Basic " + encoded);
        proxyAuthorization = Base64.encode(ByteUtils.toBytes(userName + ':' + password));
    }

    public <T extends Rsp> T execute(Req<T> request) throws ApiException {
        HttpRsp rt = this.doPost(request);
        if (rt == null) {
            return null;
        }

        String contentType = rt.getContentType();
        //        Class<T> respClass = (Class<T>) TypeUtils.getActualType(request.getClass(), Req.class);
        Class<T> respClass = request.getRspClass();
        EopParser<T> parser = contentType != null && contentType.contains("text/xml") ?
                new ObjectXmlParser<T>(respClass) : new ObjectJsonParser<T>(respClass);
        T tRsp = null;
        String rspMsg = rt.getContent();
        try {
            tRsp = parser.parse(rspMsg);
        }
        catch (RuntimeException e) {
            EopLogger.logBizError(rspMsg);
            throw e;
        }

        if (!tRsp.isSuccess()) {
            EopLogger.logErrorScene(rt, tRsp, signKey);
        }
        tRsp.setQueryString(rt.getQuery());
        return tRsp;
    }

    private <T extends Rsp> HttpRsp doPost(Req<T> request)
            throws ApiException {
        EopMap actionParams = new EopMap(request.getParams());
        actionParams.put("eop_appcode", appcode);
        actionParams.put("eop_action", request.getAction());
        if (!StringUtils.isEmpty(fmt)) {
            actionParams.put("eop_fmt", fmt);
        }
        if (!StringUtils.isEmpty(request.getApptx())) {
            actionParams.put("eop_apptx", request.getApptx());
        }
        if (request.isMock()) {
            actionParams.put("eop_mock", "true");
        }
        actionParams.put("eop_reqts", System.currentTimeMillis());
        EopMap securetValueParams = request.getSecuretValueParams();
        if (securetValueParams != null && securetValueParams.size() > 0) {
            for (Entry<String, String> securetValueEntry : securetValueParams.entrySet()) {
                actionParams.put(securetValueEntry.getKey(),
                        EopUtils.createSecuret(paramAlgorithm, paramKey, securetValueEntry.getValue()));
            }
        }

        EopMap securetKeyValueParams = request.getSecuretKeyValueParams();
        if (securetKeyValueParams != null && securetKeyValueParams.size() > 0) {
            String eopCipher = EopUtils.createQueryString(securetKeyValueParams);
            actionParams.put("eop_cipher", EopUtils.createSecuret(paramAlgorithm, paramKey, eopCipher));
        }

        // 是否签名
        if (isSign()) {
            String signResult = null;
            try {
                Pair<String, String> signPair = EopUtils.signEopRequest(signAlgorithm, actionParams, signKey);
                signResult = signPair.getFirst();
            }
            catch (IOException e) {
                throw new ApiException(e);
            }
            actionParams.put("eop_sign", signResult);
        }

        try {
            return WebUtils.doPost(proxy, proxyAuthorization,
                    serverUrl, actionParams, connectTimeout, readTimeout);
        }
        catch (IOException e) {
            throw new ApiException(e);
        }

    }

    public void setSignAlgorithm(String signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
    }

    public String getSignAlgorithm() {
        return signAlgorithm;
    }

    public String getSignKey() {
        return signKey;
    }

    public String getFormat() {
        return fmt;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setSignKey(String signKey) {
        this.signKey = signKey;
    }

    public void setFormat(String format) {
        fmt = format;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamAlgorithm(String paramAlgorithm) {
        this.paramAlgorithm = paramAlgorithm;
    }

    public String getParamAlgorithm() {
        return paramAlgorithm;
    }

    public boolean isSign() {
        return sign;
    }

    public void setSign(boolean sign) {
        this.sign = sign;
    }

}
