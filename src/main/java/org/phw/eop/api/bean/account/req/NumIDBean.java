package org.phw.eop.api.bean.account.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * NumIDBean对象
 * @author xrx
 *
 */
public class NumIDBean {

    @ReqField(tagName = "SerialNumber")
    private String serialNumber;

    @ReqField(tagName = "ProKey")
    private String proKey;

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

    public String getProKey() {
        return proKey;
    }

    public void setProKey(String proKey) {
        this.proKey = proKey;
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
