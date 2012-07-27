package org.phw.eop.api.bean.carddatasynsub;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.carddatasynsub.rsp.CardDataSynSubRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 卡数据同步提交接口
 * @author janis
 *
 */
@EopBean
public class CardDataSynSubRsp extends BaseRsp {

    private CardDataSynSubRspBody rspBody;

    public CardDataSynSubRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(CardDataSynSubRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public Object getBody() {
        return rspBody;
    }

}
