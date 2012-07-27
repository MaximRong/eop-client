package org.phw.eop.api.bean.carddatasynsub;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.carddatasynsub.req.CardDataSynSubReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 卡数据同步提交接口
 * @author janis
 *
 */
@EopBean
public class CardDataSynSubReq extends BaseReq<CardDataSynSubRsp> {

    private CardDataSynSubReqBody reqBody;

    private String bodyRoot = "OrderSubReq";

    @Override
    public String getAction() {
        return "ess.carddatasynsubreq";
    }

    @Override
    public String getApptx() {
        return "ess.carddatasynsubreq";
    }

    @Override
    public Class<CardDataSynSubRsp> getRspClass() {
        return CardDataSynSubRsp.class;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

    public CardDataSynSubReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(CardDataSynSubReqBody reqBody) {
        this.reqBody = reqBody;
    }

}
