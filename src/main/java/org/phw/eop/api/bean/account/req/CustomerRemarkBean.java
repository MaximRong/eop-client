package org.phw.eop.api.bean.account.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class CustomerRemarkBean {

    @ReqField(tagName = "CustomerRemarkID")
    private String customerRemarkID;

    @ReqField(tagName = "CustomerRemarkValue")
    private String customerRemarkValue;

    public String getCustomerRemarkID() {
        return customerRemarkID;
    }

    public void setCustomerRemarkID(String customerRemarkID) {
        this.customerRemarkID = customerRemarkID;
    }

    public String getCustomerRemarkValue() {
        return customerRemarkValue;
    }

    public void setCustomerRemarkValue(String customerRemarkValue) {
        this.customerRemarkValue = customerRemarkValue;
    }

}
