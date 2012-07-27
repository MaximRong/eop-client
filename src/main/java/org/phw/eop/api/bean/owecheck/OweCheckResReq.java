package org.phw.eop.api.bean.owecheck;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.owecheck.req.OweCheckResReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 自备终端入网校验ReqBean。</br>
 * 
 * 接口：自备终端入网校验。
 *
 * @author wanglei
 *
 * 2012-1-9
 */
@EopBean
public class OweCheckResReq extends BaseReq<OweCheckResRsp> {

    private OweCheckResReqBody reqBody;

    private String bodyRoot = "OweCheckResReq";

    @Override
    public String getAction() {
        return "ess.checkres";
    }

    @Override
    public String getApptx() {
        return "ess.checkres";
    }

    @Override
    public Class<OweCheckResRsp> getRspClass() {
        return OweCheckResRsp.class;
    }

    public OweCheckResReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(OweCheckResReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

}
