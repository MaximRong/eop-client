package org.phw.eop.api.bean.checkcust.rsp;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 校验客户资料信息接口的请求报文体。
 * @author xrx
 */
public class CheckCustRspBody implements Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "RespCode")
    private String respCode;

    @RspField(tagName = "RespDesc")
    private String respDesc;

    @RspField(tagName = "CustomerType")
    private String customerType;

    @RspField(tagName = "CustomerLevel")
    private String customerLevel;

    @RspField(tagName = "CustomerLoc")
    private String customerLoc;

    @RspField(tagName = "CustomerName")
    private String customerName;

    @RspField(tagName = "CertExpireDate")
    private String certExpireDate;

    @RspField(tagName = "ContactPerson")
    private String contactPerson;

    @RspField(tagName = "ContactPhone")
    private String contactPhone;

    @RspField(tagName = "Para")
    private List<ParaBean> para;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getCustomerLoc() {
        return customerLoc;
    }

    public void setCustomerLoc(String customerLoc) {
        this.customerLoc = customerLoc;
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

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

}
