package org.phw.eop.api.bean.checkstaff;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.checkstaff.req.CheckStaffReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 员工校验接口ReqBean
 * 
 * @author Lurker
 * 
 */
@EopBean
public class CheckStaffReq extends BaseReq<CheckStaffRsp> {

    private CheckStaffReqBody reqBody;

    private String bodyRoot = "StaffCheckReq";

    @Override
    public String getAction() {
        return "ess.checkstaff";
    }

    @Override
    public String getApptx() {
        return "ess.checkstaff";
    }

    @Override
    public Class<CheckStaffRsp> getRspClass() {
        return CheckStaffRsp.class;
    }

    public CheckStaffReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(CheckStaffReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

}
