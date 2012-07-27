package org.phw.eop.api.bean.accountreq.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class NumIDBean {

    @ReqField(tagName = "SerialNumber")
    private String serialNumber;

    @ReqField(tagName = "NumProcId")
    private String numProcId;

    @ReqField(tagName = "ServiceType")
    private String serviceType;

    @ReqField(tagName = "AreaCode")
    private String areaCode;

    @ReqField(tagName = "BindNumID")
    private String bindNumID;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNumProcId() {
        return numProcId;
    }

    public void setNumProcId(String numProcId) {
        this.numProcId = numProcId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getBindNumID() {
        return bindNumID;
    }

    public void setBindNumID(String bindNumID) {
        this.bindNumID = bindNumID;
    }
}
