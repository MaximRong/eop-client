package org.phw.eop.api.bean.querysnuser.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class CustInfoBean {
    @RspField(tagName = "CUST_ID")
    private String custId;

    @RspField(tagName = "CUST_COMPL_FLAG")
    private String custComplFlag;

    @RspField(tagName = "CUST_NAME")
    private String custName;

    @RspField(tagName = "CUST_TYPE")
    private String custType;

    @RspField(tagName = "CUST_STATE")
    private String custState;

    @RspField(tagName = "CERT_END_DATE")
    private String certEndDate;

    @RspField(tagName = "CERT_ADDR")
    private String certAddr;

    @RspField(tagName = "CERT_TYPE_CODE")
    private String certTypeCode;

    @RspField(tagName = "CERT_CODE")
    private String certCode;

    @RspField(tagName = "PROVINCE_CODE")
    private String provinceCode;

    @RspField(tagName = "EPARCHY_CODE")
    private String eparchyCode;

    @RspField(tagName = "AUDIT_NUM")
    private String auditNum;

    @RspField(tagName = "DEVELOP_DEPART_ID")
    private String developDepartId;

    @RspField(tagName = "DEVELOP_STAFF_ID")
    private String developStaffId;

    @RspField(tagName = "IN_DEPART_ID")
    private String inDepartId;

    @RspField(tagName = "IN_STAFF_ID")
    private String inStaffId;

    @RspField(tagName = "IN_DATE")
    private String inDate;

    @RspField(tagName = "REMOVE_DATE")
    private String removeDate;

    @RspField(tagName = "REMARK")
    private String remark;

    @RspField(tagName = "CUST_CLASS_TYPE")
    private String custClassType;

    @RspField(tagName = "CUSTOMER_LEVEL")
    private String customerLevel;

    @RspField(tagName = "CREDIT_CLASS")
    private String creditClass;

    @RspField(tagName = "CUSTOMER_LOC")
    private String customerLoc;

    @RspField(tagName = "SEX")
    private String sex;

    @RspField(tagName = "BIRTHDAY")
    private String birthday;

    @RspField(tagName = "BIRTHDAY_LUNAR")
    private String birthdayLunar;

    @RspField(tagName = "BIRTHDAY_FLAG")
    private String birthdayFlag;

    @RspField(tagName = "POST_ADDRESS")
    private String postAddress;

    @RspField(tagName = "POST_CODE")
    private String postCode;

    @RspField(tagName = "POST_PERSON")
    private String postPerson;

    @RspField(tagName = "PHONE")
    private String phone;

    @RspField(tagName = "FAX_NBR")
    private String faxNbr;

    @RspField(tagName = "EMAIL")
    private String email;

    @RspField(tagName = "HOME_ADDRESS")
    private String homeAddress;

    @RspField(tagName = "HOME_PHONE")
    private String homePhone;

    @RspField(tagName = "CONTACT")
    private String contact;

    @RspField(tagName = "CONTACT_PHONE")
    private String contactPhone;

    @RspField(tagName = "NATIONALITY_CODE")
    private String nationalityCode;

    @RspField(tagName = "LOCAL_NATIVE_CODE")
    private String localNativeCode;

    @RspField(tagName = "VIP_CUST_INFO")
    private VipCustInfoBean vipCustInfo;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustComplFlag() {
        return custComplFlag;
    }

    public void setCustComplFlag(String custComplFlag) {
        this.custComplFlag = custComplFlag;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public String getCertEndDate() {
        return certEndDate;
    }

    public void setCertEndDate(String certEndDate) {
        this.certEndDate = certEndDate;
    }

    public String getCertAddr() {
        return certAddr;
    }

    public void setCertAddr(String certAddr) {
        this.certAddr = certAddr;
    }

    public String getCertTypeCode() {
        return certTypeCode;
    }

    public void setCertTypeCode(String certTypeCode) {
        this.certTypeCode = certTypeCode;
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getEparchyCode() {
        return eparchyCode;
    }

    public void setEparchyCode(String eparchyCode) {
        this.eparchyCode = eparchyCode;
    }

    public String getAuditNum() {
        return auditNum;
    }

    public void setAuditNum(String auditNum) {
        this.auditNum = auditNum;
    }

    public String getDevelopDepartId() {
        return developDepartId;
    }

    public void setDevelopDepartId(String developDepartId) {
        this.developDepartId = developDepartId;
    }

    public String getDevelopStaffId() {
        return developStaffId;
    }

    public void setDevelopStaffId(String developStaffId) {
        this.developStaffId = developStaffId;
    }

    public String getInDepartId() {
        return inDepartId;
    }

    public void setInDepartId(String inDepartId) {
        this.inDepartId = inDepartId;
    }

    public String getInStaffId() {
        return inStaffId;
    }

    public void setInStaffId(String inStaffId) {
        this.inStaffId = inStaffId;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getRemoveDate() {
        return removeDate;
    }

    public void setRemoveDate(String removeDate) {
        this.removeDate = removeDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCustClassType() {
        return custClassType;
    }

    public void setCustClassType(String custClassType) {
        this.custClassType = custClassType;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getCreditClass() {
        return creditClass;
    }

    public void setCreditClass(String creditClass) {
        this.creditClass = creditClass;
    }

    public String getCustomerLoc() {
        return customerLoc;
    }

    public void setCustomerLoc(String customerLoc) {
        this.customerLoc = customerLoc;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthdayLunar() {
        return birthdayLunar;
    }

    public void setBirthdayLunar(String birthdayLunar) {
        this.birthdayLunar = birthdayLunar;
    }

    public String getBirthdayFlag() {
        return birthdayFlag;
    }

    public void setBirthdayFlag(String birthdayFlag) {
        this.birthdayFlag = birthdayFlag;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostPerson() {
        return postPerson;
    }

    public void setPostPerson(String postPerson) {
        this.postPerson = postPerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaxNbr() {
        return faxNbr;
    }

    public void setFaxNbr(String faxNbr) {
        this.faxNbr = faxNbr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public String getLocalNativeCode() {
        return localNativeCode;
    }

    public void setLocalNativeCode(String localNativeCode) {
        this.localNativeCode = localNativeCode;
    }

    public VipCustInfoBean getVipCustInfo() {
        return vipCustInfo;
    }

    public void setVipCustInfo(VipCustInfoBean vipCustInfo) {
        this.vipCustInfo = vipCustInfo;
    }

}
