package org.phw.eop.api.bean.checkres;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.checkres.req.CheckResReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 销售资源状态变更ReqBean。</br>
 * 
 * 接口：销售资源状态变更。
 *
 * @author wanglei
 *
 * 2012-1-9
 */
@EopBean
public class CheckResReq extends BaseReq<CheckResRsp> {

    private CheckResReqBody reqBody;

    private String bodyRoot = "CheckResReq";

    @Override
    public String getAction() {
        return "ess.checkres";
    }

    @Override
    public String getApptx() {
        return "ess.checkres";
    }

    @Override
    public Class<CheckResRsp> getRspClass() {
        return CheckResRsp.class;
    }

    public CheckResReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(CheckResReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

}
