package org.phw.eop.api.bean.checkcust;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.checkcust.rsp.CheckCustRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 校验客户资料信息接口RspBean.
 * @author xrx
 *
 */
@EopBean
public class CheckCustRsp extends BaseRsp {

    private CheckCustRspBody rspBody;

    public CheckCustRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(CheckCustRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public CheckCustRspBody getBody() {
        return rspBody;
    }

}
