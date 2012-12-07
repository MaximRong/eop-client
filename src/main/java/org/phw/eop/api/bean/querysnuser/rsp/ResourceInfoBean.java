package org.phw.eop.api.bean.querysnuser.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class ResourceInfoBean {

    @RspField(tagName = "INSTALL_ADDRESS")
    private String installAddress;
    
    @RspField(tagName = "CITY_CODE")
    private String cityCode;
    
    @RspField(tagName = "EXCH_CODE")
    private String exchCode;
    
    @RspField(tagName = "ADDRESS_CODE")
    private String addressCode;
    
    @RspField(tagName = "ADDRESS_NAME")
    private String addressName;
    
    @RspField(tagName = "APPOINTMENT")
    private String appointment;

    public String getInstallAddress() {
        return installAddress;
    }

    public void setInstallAddress(String installAddress) {
        this.installAddress = installAddress;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getExchCode() {
        return exchCode;
    }

    public void setExchCode(String exchCode) {
        this.exchCode = exchCode;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

}
