package org.phw.eop.api.bean.qrycarddata;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.qrycarddata.rsp.GetDataRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 *  写卡数据查询接口 应答报文
 * 
 * @author lita
 *
 */
@EopBean
public class GetDataRsp extends BaseRsp {

    private GetDataRspBody rspBody;

    @Override
    public GetDataRspBody getBody() {
        return rspBody;
    }

    public GetDataRspBody getRspbody() {
        return rspBody;
    }

    public void setRspBody(GetDataRspBody rspBody) {
        this.rspBody = rspBody;
    }

}
