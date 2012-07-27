package org.phw.eop.api.bean.accountcommit;

import org.phw.eop.api.bean.accountcommit.rsp.AccountCommitRspBody;
import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 开户提交接口返回报文.
 * @author lita
 *
 */
@EopBean
public class AccountCommitRsp extends BaseRsp {

    private AccountCommitRspBody rspBody;

    public AccountCommitRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(AccountCommitRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public Object getBody() {
        return rspBody;
    }
}
