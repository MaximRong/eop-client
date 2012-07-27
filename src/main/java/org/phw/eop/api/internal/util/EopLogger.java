package org.phw.eop.api.internal.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.phw.eop.api.Constants;
import org.phw.eop.api.Rsp;

/**
 * 客户端日志
 * 通讯错误格式：time^_^api^_^app^_^ip^_^os^_^sdk^_^url^responseCode
 * 业务错误格式：time^_^response
 */
public class EopLogger {

    private static final Logger clog = Logger.getLogger("eop.clog");
    private static final Logger blog = Logger.getLogger("eop.blog");

    private static String osName = System.getProperties().getProperty("os.name");
    private static String ip = null;

    public static String getIp() {
        if (ip == null) {
            try {
                ip = InetAddress.getLocalHost().getHostAddress();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ip;
    }

    public static void setIp(String ip) {
        EopLogger.ip = ip;
    }

    /**
     * 通讯错误日志
     */
    public static void logCommError(Exception e, HttpURLConnection conn, String appKey,
            String method, byte[] content) {
        String contentString = null;
        try {
            contentString = new String(content, "UTF-8");
            logCommError(e, conn, appKey, method, contentString);
        }
        catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    /**
     * 通讯错误日志
     */
    public static void logCommError(Exception e, String url, String appKey, String method,
            byte[] content) {
        String contentString = null;
        try {
            contentString = new String(content, "UTF-8");
            logCommError(e, url, appKey, method, contentString);
        }
        catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }

    }

    /**
     * 通讯错误日志
     */
    public static void logCommError(Exception e, HttpURLConnection conn, String appKey,
            String method, Map<String, String> params) {
        _logCommError(e, conn, null, appKey, method, params);
    }

    public static void logCommError(Exception e, String url, String appKey, String method,
            Map<String, String> params) {
        _logCommError(e, null, url, appKey, method, params);

    }

    /**
     * 通讯错误日志
     */
    private static void logCommError(Exception e, HttpURLConnection conn, String appKey,
            String method, String content) {
        Map<String, String> params = parseParam(content);
        _logCommError(e, conn, null, appKey, method, params);

    }

    /**
     * 通讯错误日志
     */
    private static void logCommError(Exception e, String url, String appKey, String method,
            String content) {
        Map<String, String> params = parseParam(content);
        _logCommError(e, null, url, appKey, method, params);
    }

    /**
     * 通讯错误日志
     */
    private static void _logCommError(Exception e, HttpURLConnection conn, String url,
            String appKey, String method, Map<String, String> params) {
        DateFormat df = new SimpleDateFormat(Constants.DATE_TIME_FORMAT);
        df.setTimeZone(TimeZone.getTimeZone(Constants.DATE_TIMEZONE));
        String urlStr = null;
        String rspCode = "";
        if (conn != null) {
            try {
                urlStr = conn.getURL().toString();
                rspCode = "HTTP_ERROR_" + conn.getResponseCode();
            }
            catch (IOException ioe) {
            }
        }
        else {
            urlStr = url;
            rspCode = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(df.format(new Date()));// 时间
        sb.append("^_^");
        sb.append(method);// API
        sb.append("^_^");
        sb.append(appKey);// APP
        sb.append("^_^");
        sb.append(getIp());// IP地址
        sb.append("^_^");
        sb.append(osName);// 操作系统
        sb.append("^_^");
        sb.append(urlStr);// 请求URL
        sb.append("^_^");
        sb.append(rspCode);
        sb.append("^_^");
        sb.append((e.getMessage() + "").replaceAll("\r\n", " "));
        clog.error(sb.toString());
    }

    private static Map<String, String> parseParam(String contentString) {
        Map<String, String> params = new HashMap<String, String>();
        if (contentString == null || contentString.trim().equals("")) {
            return params;
        }
        String[] paramsArray = contentString.split("\\&");
        if (paramsArray != null) {
            for (String param : paramsArray) {
                String[] keyValue = param.split("=");
                if (keyValue != null && keyValue.length == 2) {
                    params.put(keyValue[0], keyValue[1]);
                }
            }
        }
        return params;
    }

    /**
     * 业务/系统错误日志
     */
    public static void logBizError(String rsp) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone(Constants.DATE_TIMEZONE));
        StringBuilder sb = new StringBuilder();
        sb.append(df.format(new Date()));
        sb.append("^_^");
        sb.append(rsp);
        blog.error(sb.toString());
    }

    /**
     * 发生特别错误时记录完整错误现场
     */
    public static void logErrorScene(HttpRsp rt, Rsp tRsp, String appSecret) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone(Constants.DATE_TIMEZONE));
        StringBuilder sb = new StringBuilder();
        sb.append("ErrorScene");
        sb.append("^_^");
        sb.append(tRsp.getRspcode());
        sb.append("^_^");
        sb.append(appSecret);
        sb.append("^_^");
        sb.append(ip);
        sb.append("^_^");
        sb.append(osName);
        sb.append("^_^");
        sb.append(df.format(new Date()));
        sb.append("^_^");
        sb.append("ApplicationParams:");
        sb.append(rt.getQuery());
        sb.append("^_^");
        sb.append("Body:");
        sb.append(rt.getContent());
        blog.error(sb.toString());
    }

}
