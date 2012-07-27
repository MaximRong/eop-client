package org.phw.eop.api.bean.accountreq;

import org.phw.eop.api.bean.accountreq.rsp.AccountReqRspBody;
import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 开户处理申请RspBean。
 * 
 * 接口：开户处理申请。
 *
 * @author wanglei
 *
 * 2012-1-9
 */
public class AccountReqRsp extends BaseRsp {

    @ReqField(tagName = "RspBody")
    private AccountReqRspBody rspBody;

    public AccountReqRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(AccountReqRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public Object getBody() {
        return rspBody;
    }

}
