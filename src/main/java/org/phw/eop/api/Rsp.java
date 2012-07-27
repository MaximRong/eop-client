package org.phw.eop.api;

/**
 * EOP基础响应信息。
 * 
 */
public abstract class Rsp {
    private String rspcode;
    private String rspdesc;
    private String trxid;
    private String rspmsg;
    private String queryString;

    @Override
    public String toString() {
        return "EopRsp [rspcode=" + this.rspcode + ", rspdesc=" + this.rspdesc + ", trxid=" + this.trxid + ", rspmsg="
                + this.rspmsg + "]";
    }

    public String getRspcode() {
        return this.rspcode;
    }

    public void setRspcode(String rspcode) {
        this.rspcode = rspcode;
    }

    public boolean isSuccess() {
        return "0".equals(this.rspcode);
    }

    public void setTrxid(String trxid) {
        this.trxid = trxid;
    }

    public String getTrxid() {
        return this.trxid;
    }

    public void setRspdesc(String rspdesc) {
        this.rspdesc = rspdesc;
    }

    public String getRspdesc() {
        return this.rspdesc;
    }

    public void setRspmsg(String rspMsg) {
        this.rspmsg = rspMsg;
    }

    public String getRspmsg() {
        return this.rspmsg;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getQueryString() {
        return queryString;
    }
}
