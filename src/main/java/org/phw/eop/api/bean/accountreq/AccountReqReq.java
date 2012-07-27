package org.phw.eop.api.bean.accountreq;

import org.phw.eop.api.bean.accountreq.req.AccountReqReqBody;
import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 开户处理申请ReqBean。</br>
 * 
 * 接口：开户处理申请。
 *
 * @author wanglei
 *
 * 2012-1-9
 */
public class AccountReqReq extends BaseReq<AccountReqRsp> {

    @ReqField(tagName = "ReqBody")
    private AccountReqReqBody reqBody;

    @ReqField(tagName = "BodyRoot")
    private String bodyRoot = "AccountReq";

    @Override
    public String getAction() {
        return "ess.accountreq";
    }

    @Override
    public String getApptx() {
        return "ess.accountreq";
    }

    @Override
    public Class<AccountReqRsp> getRspClass() {
        return AccountReqRsp.class;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

    public AccountReqReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(AccountReqReqBody reqBody) {
        this.reqBody = reqBody;
    }

}
