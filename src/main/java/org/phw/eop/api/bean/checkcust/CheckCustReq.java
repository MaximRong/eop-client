package org.phw.eop.api.bean.checkcust;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.checkcust.req.CheckCustReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 校验客户资料信息接口ReqBean.
 * @author xrx
 *
 */
@EopBean
public class CheckCustReq extends BaseReq<CheckCustRsp> {

    private CheckCustReqBody reqBody;

    private String bodyRoot = "CheckCustReq";

    @Override
    public String getAction() {
        return "ess.checkcust";
    }

    @Override
    public String getApptx() {
        return "ess.checkcust";
    }

    @Override
    public Class<CheckCustRsp> getRspClass() {
        return CheckCustRsp.class;
    }

    public CheckCustReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(CheckCustReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

}
