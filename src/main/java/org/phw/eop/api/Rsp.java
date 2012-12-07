package org.phw.eop.api;

/**
 * EOP基础响应信息。
 * 
 */
public abstract class Rsp {
    private String rspcode;
    private String rspdesc;
    private String trxid;
    private Object rspmsg;
    private String queryString;

    @Override
    public String toString() {
        return "EopRsp [rspcode=" + rspcode + ", rspdesc=" + rspdesc + ", trxid=" + trxid + ", rspmsg="
                + rspmsg + "]";
    }

    public String getRspcode() {
        return rspcode;
    }

    public void setRspcode(String rspcode) {
        this.rspcode = rspcode;
    }

    public boolean isSuccess() {
        return "0".equals(rspcode);
    }

    public void setTrxid(String trxid) {
        this.trxid = trxid;
    }

    public String getTrxid() {
        return trxid;
    }

    public void setRspdesc(String rspdesc) {
        this.rspdesc = rspdesc;
    }

    public String getRspdesc() {
        return rspdesc;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getQueryString() {
        return queryString;
    }

    public Object getRspmsg() {
        return rspmsg;
    }

    public void setRspmsg(Object rspmsg) {
        this.rspmsg = rspmsg;
    }
}
