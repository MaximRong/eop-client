package org.phw.eop.api.bean.account;

import org.phw.eop.api.bean.account.req.AccountReqBody;
import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 开户处理申请ReqBean
 * @author xrx
 *
 */
@EopBean
public class AccountReq extends BaseReq<AccountRsp> {

    private AccountReqBody reqBody;

    private String bodyRoot = "AccountReq";


    @Override
    public String getAction() {
        return "ess.account";
    }

    @Override
    public String getApptx() {
        return "ess.account";
    }

    @Override
    public Class<AccountRsp> getRspClass() {
        return AccountRsp.class;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

    public AccountReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(AccountReqBody reqBody) {
        this.reqBody = reqBody;
    }

}
