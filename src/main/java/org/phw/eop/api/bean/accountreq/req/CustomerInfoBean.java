package org.phw.eop.api.bean.accountreq.req;

import java.util.List;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class CustomerInfoBean {

    @ReqField(tagName = "AuthTag")
    private String authTag;

    @ReqField(tagName = "RealNameType")
    private String realNameType;

    @ReqField(tagName = "CustType")
    private String custType;

    @ReqField(tagName = "CertType")
    private String certType;

    @ReqField(tagName = "CertNum")
    private String certNum;

    @ReqField(tagName = "CustomerName")
    private String customerName;

    @ReqField(tagName = "CertExpireDate")
    private String certExpireDate;

    @ReqField(tagName = "ContactPerson")
    private String contactPerson;

    @ReqField(tagName = "ContactPhone")
    private String contactPhone;

    @ReqField(tagName = "CustomerRemark")
    private List<CustomerRemarkBean> customerRemark;

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

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCertExpireDate() {
        return certExpireDate;
    }

    public void setCertExpireDate(String certExpireDate) {
        this.certExpireDate = certExpireDate;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public List<CustomerRemarkBean> getCustomerRemark() {
        return customerRemark;
    }

    public void setCustomerRemark(List<CustomerRemarkBean> customerRemark) {
        this.customerRemark = customerRemark;
    }

}
