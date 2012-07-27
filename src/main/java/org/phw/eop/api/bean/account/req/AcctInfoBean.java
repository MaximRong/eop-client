package org.phw.eop.api.bean.account.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class AcctInfoBean {

    @ReqField(tagName = "CreateOrExtendsAcct")
    private String createOrExtendsAcct;

    @ReqField(tagName = "AccountPayType")
    private String accountPayType;

    public String getCreateOrExtendsAcct() {
        return createOrExtendsAcct;
    }

    public void setCreateOrExtendsAcct(String createOrExtendsAcct) {
        this.createOrExtendsAcct = createOrExtendsAcct;
    }

    public String getAccountPayType() {
        return accountPayType;
    }

    public void setAccountPayType(String accountPayType) {
        this.accountPayType = accountPayType;
    }

}
