package org.phw.eop.api.bean.account;

import org.phw.eop.api.bean.account.rsp.AccountRspBody;
import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 开户处理申请RspBean。
 * @author xrx
 * 
 */
@EopBean
public class AccountRsp extends BaseRsp {

    private AccountRspBody rspBody;

    public AccountRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(AccountRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public Object getBody() {
        return rspBody;
    }

}
