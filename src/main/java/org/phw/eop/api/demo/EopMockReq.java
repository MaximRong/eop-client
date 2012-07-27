package org.phw.eop.api.demo;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class EopMockReq extends BaseReq<EopMockRsp> {
    @ReqField
    private String appid;
    @ReqField
    private String actionid;

    @Override
    public String getAction() {
        return "admin.mock.query";
    }

    @Override
    public String getApptx() {
        return "EopMockReq";
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

    @Override
    public Class<EopMockRsp> getRspClass() {
        return EopMockRsp.class;
    }

}
