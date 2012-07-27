package org.phw.eop.api.bean.account.req;

import java.util.List;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class CustomerInfoBean {

    @ReqField(tagName = "AuthTag")
    private String authTag;

    @ReqField(tagName = "RealNameType")
    private String realNameType;

    @ReqField(tagName = "CustType")
    private String custType;

    @ReqField(tagName = "NewCustomerInfo")
    private List<NewCustomerInfoBean> newCustomerInfo;

    public String getAuthTag() {
        return authTag;
    }

    public void setAuthTag(String authTag) {
        this.authTag = authTag;
    }

    public String getRealNameType() {
        return realNameType;
    }

    public void setRealNameType(String realNameType) {
        this.realNameType = realNameType;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public List<NewCustomerInfoBean> getNewCustomerInfo() {
        return newCustomerInfo;
    }

    public void setNewCustomerInfo(List<NewCustomerInfoBean> newCustomerInfo) {
        this.newCustomerInfo = newCustomerInfo;
    }

}
