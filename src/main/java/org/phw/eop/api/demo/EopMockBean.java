package org.phw.eop.api.demo;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class EopMockBean {
    @RspField
    private String appid;
    @RspField
    private String actionid;
    @RspField
    private String expr;
    @RspField
    private String rsp;
    @RspField
    private int pri;

    @Override
    public String toString() {
        return "EopMockBean [appid=" + appid + ", actionid=" + actionid + ", expr=" + expr + ", rsp=" + rsp + ", pri="
                + pri + "]";
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getActionid() {
        return actionid;
    }

    public void setActionid(String actionid) {
        this.actionid = actionid;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public String getRsp() {
        return rsp;
    }

    public void setRsp(String rsp) {
        this.rsp = rsp;
    }

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

}
