package org.phw.eop.api.bean.numqry;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.numqry.req.NumQryReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 号码查询接口ReqBean。</br>
 * 
 * @author zhaowj
 *
 * 2012-1-9
 */
@EopBean
public class NumQryReq extends BaseReq<NumQryRsp> {

    private NumQryReqBody reqBody;

    private String bodyRoot = "NumQueryReq";

    @Override
    public String getAction() {
        return "ess.numquery";
    }

    @Override
    public String getApptx() {
        return "ess.numquery";
    }

    @Override
    public Class<NumQryRsp> getRspClass() {
        return NumQryRsp.class;
    }

    public NumQryReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(NumQryReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

}
