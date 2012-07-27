package org.phw.eop.api.bean.submitorder;

import java.io.Serializable;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.submitorder.rsp.SubmitOrderRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 订单提交接口返回报文Bean
 * 
 * @author max
 */
@EopBean
public class SubmitOrderRsp extends BaseRsp implements Serializable {

    private static final long  serialVersionUID = 1L;

    private SubmitOrderRspBody rspBody;

    @Override
    public Object getBody() {
        return rspBody;
    }

    public SubmitOrderRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(SubmitOrderRspBody rspBody) {
        this.rspBody = rspBody;
    }

}
