package org.phw.eop.api.bean.checknum;

import java.io.Serializable;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.checknum.req.CheckNumReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 号码资源状态变更接口ReqBean.
 * @author xrx
 *
 */
@EopBean
public class CheckNumReq extends BaseReq<CheckNumRsp> implements Serializable {

    private static final long serialVersionUID = 1L;

    private CheckNumReqBody reqBody;

    private String bodyRoot = "CheckNumReq";

    @Override
    public String getAction() {
        return "ess.checknum";
    }

    @Override
    public String getApptx() {
        return "ess.checknum";
    }

    @Override
    public Class<CheckNumRsp> getRspClass() {
        return CheckNumRsp.class;
    }

    public CheckNumReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(CheckNumReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

}
