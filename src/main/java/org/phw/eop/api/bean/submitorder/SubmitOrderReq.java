package org.phw.eop.api.bean.submitorder;

import java.io.Serializable;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.submitorder.req.SubmitOrderReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 订单提交接口请求报文Bean
 * 
 * @author max
 */
@EopBean
public class SubmitOrderReq extends BaseReq<SubmitOrderRsp> implements Serializable {

    private static final long  serialVersionUID = 1L;

    private SubmitOrderReqBody reqBody;

    private String             bodyRoot         = "OrdSbmReq";

    @Override
    public String getAction() {
        return "thirdparty.submitorder";
    }

    @Override
    public String getApptx() {
        return "thirdparty.submitorder";
    }

    @Override
    public Class<SubmitOrderRsp> getRspClass() {
        return SubmitOrderRsp.class;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

    public void setBodyRoot(String bodyRoot) {
        this.bodyRoot = bodyRoot;
    }

    public SubmitOrderReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(SubmitOrderReqBody reqBody) {
        this.reqBody = reqBody;
    }

}
