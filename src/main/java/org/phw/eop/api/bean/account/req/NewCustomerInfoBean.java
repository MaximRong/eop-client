package org.phw.eop.api.bean.account.req;

import java.util.List;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class NewCustomerInfoBean {

    @ReqField(tagName = "CertType")
    private String certType;

    @ReqField(tagName = "CertNum")
    private String certNum;

    @ReqField(tagName = "CertAdress")
    private String certAdress;

    @ReqField(tagName = "CustomerName")
    private String customerName;

    @ReqField(tagName = "CertExpireDate")
    private String certExpireDate;

    @ReqField(tagName = "ContactPerson")
    private String contactPerson;

    @ReqField(tagName = "ContactPhone")
    private String contactPhone;

    @ReqField(tagName = "ContactAddress")
    private String contactAddress;

    @ReqField(tagName = "CustType")
    private String custType;

    @ReqField(tagName = "CustomerRemark")
    private List<CustomerRemarkBean> customerRemark;

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

    public String getCertAdress() {
        return certAdress;
    }

    public void setCertAdress(String certAdress) {
        this.certAdress = certAdress;
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

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public List<CustomerRemarkBean> getCustomerRemark() {
        return customerRemark;
    }

    public void setCustomerRemark(List<CustomerRemarkBean> customerRemark) {
        this.customerRemark = customerRemark;
    }

}
