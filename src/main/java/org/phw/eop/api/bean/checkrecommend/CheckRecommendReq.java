package org.phw.eop.api.bean.checkrecommend;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.checkrecommend.req.CheckRecommendReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 推荐人信息校验接口 请求报文
 * @author lita
 *
 */
@EopBean
public class CheckRecommendReq extends BaseReq<CheckRecommendRsp> {

    private CheckRecommendReqBody reqBody;

    private String bodyRoot = "RecommendCheckReq";

    @Override
    public String getAction() {
        return "ess.checkrecommend";
    }

    @Override
    public String getApptx() {
        return "ess.checkrecommend";
    }

    @Override
    public Class<CheckRecommendRsp> getRspClass() {
        return CheckRecommendRsp.class;
    }

    public CheckRecommendReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(CheckRecommendReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

}
