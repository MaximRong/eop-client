package org.phw.eop.api.bean.oldusercheck;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.oldusercheck.req.CheckOldUserReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class CheckOldUserReq extends BaseReq<CheckOldUserRsp> {

    private CheckOldUserReqBody reqBody;

    private String bodyRoot = "OldUserCheckReq";

    @Override
    public String getAction() {
        return "ess.oldusercheck";
    }

    @Override
    public String getApptx() {
        return "ess.oldusercheck";
    }

    @Override
    public Class<CheckOldUserRsp> getRspClass() {
        return CheckOldUserRsp.class;
    }

    public CheckOldUserReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(CheckOldUserReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

}
