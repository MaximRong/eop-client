package org.phw.eop.api.bean.checkolduser;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.checkolduser.req.CheckReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class CheckReqReq extends BaseReq<CheckReqRsp> {

    private CheckReqBody reqBody;

    private String bodyRoot = "CheckReq";

    @Override
    public String getAction() {
        return "ess.checkreq";
    }

    @Override
    public String getApptx() {
        return "ess.checkreq";
    }

    @Override
    public Class<CheckReqRsp> getRspClass() {
        return CheckReqRsp.class;
    }

    public CheckReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(CheckReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

}
