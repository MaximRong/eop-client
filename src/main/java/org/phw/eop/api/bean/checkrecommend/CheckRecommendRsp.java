package org.phw.eop.api.bean.checkrecommend;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.checkrecommend.rsp.CheckRecommendRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 推荐人信息校验接口 返回报文
 * @author lita
 *
 */
@EopBean
public class CheckRecommendRsp extends BaseRsp {

    private CheckRecommendRspBody rspBody;

    public CheckRecommendRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(CheckRecommendRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public CheckRecommendRspBody getBody() {
        return rspBody;
    }

}
