package org.phw.eop.api.bean.checknum;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.checknum.rsp.CheckNumRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 校验客户资料信息接口RspBean.
 * @author xrx
 *
 */
@EopBean
public class CheckNumRsp extends BaseRsp {

    private CheckNumRspBody rspBody;

    public CheckNumRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(CheckNumRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public CheckNumRspBody getBody() {
        return rspBody;
    }

}
