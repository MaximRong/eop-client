package org.phw.eop.api.bean.accountcommit.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class PayInfoBean {

    @ReqField(tagName = "PayType")
    private String payType;

    @ReqField(tagName = "PayOrg")
    private String payOrg;

    @ReqField(tagName = "PayNum")
    private String payNum;

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayOrg() {
        return payOrg;
    }

    public void setPayOrg(String payOrg) {
        this.payOrg = payOrg;
    }

    public String getPayNum() {
        return payNum;
    }

    public void setPayNum(String payNum) {
        this.payNum = payNum;
    }

}
