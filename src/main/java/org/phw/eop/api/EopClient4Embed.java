package org.phw.eop.api;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

import org.n3r.core.lang.RBase64;
import org.phw.eop.api.internal.parser.ParserFactory;
import org.phw.eop.api.internal.util.ByteUtils;
import org.phw.eop.api.internal.util.EopLogger;
import org.phw.eop.api.internal.util.EopMap;
import org.phw.eop.api.internal.util.HttpRsp;
import org.phw.eop.api.internal.util.StringUtils;
import org.phw.eop.api.internal.util.WebUtils;

public class EopClient4Embed {
    private String serverUrl;
    private String fmt;

    private int connectTimeout = 5 * 60 * 1000;
    private int readTimeout = 5 * 60 * 1000;
    private Proxy proxy;
    private String proxyAuthorization;

    public EopClient4Embed(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public void setProxy(String proxyHost, int proxyPort) {
        // Refre: http://www.rgagnon.com/javadetails/java-0085.html
        proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
    }

    public void setProxyAuthorization(String userName, String password) {
        // uc.setRequestProperty("Proxy-Authorization", "Basic " + encoded);
        proxyAuthorization = RBase64.encode(ByteUtils.toBytes(userName + ':' + password));
    }

    public <T extends Rsp> T execute(Req<T> request) throws ApiException {
        HttpRsp rt = this.doPost(request);
        if (rt == null) return null;

        // Class<T> respClass = (Class<T>) TypeUtils.getActualType(request.getClass(), Req.class);
        EopParser<T> parser = ParserFactory.createParser(rt.getContentType(), request.getRspClass(),
                rt.getContent() instanceof File);

        T tRsp = null;
        Object rspMsg = rt.getContent();
        try {
            tRsp = parser.parse(rspMsg);
        }
        catch (RuntimeException e) {
            EopLogger.logBizError(rspMsg.toString());
            throw e;
        }

        if (!tRsp.isSuccess()) EopLogger.logErrorScene(rt, tRsp, null);

        tRsp.setQueryString(rt.getQuery());
        return tRsp;
    }

    private <T extends Rsp> HttpRsp doPost(Req<T> request)
            throws ApiException {
        EopMap actionParams = new EopMap(request.getParams());
        actionParams.put("eop_action", request.getAction());
        if (!StringUtils.isEmpty(fmt)) actionParams.put("eop_fmt", fmt);
        if (!StringUtils.isEmpty(request.getApptx())) actionParams.put("eop_apptx", request.getApptx());
        actionParams.put("eop_reqts", System.currentTimeMillis());

        try {
            return WebUtils.doPost(proxy, proxyAuthorization,
                    serverUrl, actionParams, connectTimeout, readTimeout);
        }
        catch (IOException e) {
            throw new ApiException(e);
        }
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

    public void setFormat(String format) {
        fmt = format;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

}
