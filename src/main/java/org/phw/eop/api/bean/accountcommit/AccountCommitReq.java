package org.phw.eop.api.bean.accountcommit;

import org.phw.eop.api.bean.accountcommit.req.AccountCommitReqBody;
import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 开户提交接口请求报文.
 * @author lita
 *
 */
@EopBean
public class AccountCommitReq extends BaseReq<AccountCommitRsp> {

    private AccountCommitReqBody reqBody;

    private String bodyRoot = "CommitReq";

    @Override
    public String getAction() {
        return "ess.accountcommit";
    }

    @Override
    public String getApptx() {
        return "ess.accountcommit";
    }

    @Override
    public Class<AccountCommitRsp> getRspClass() {
        return AccountCommitRsp.class;
    }

    public AccountCommitReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(AccountCommitReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

    public void setBodyRoot(String bodyRoot) {
        this.bodyRoot = bodyRoot;
    }

}
