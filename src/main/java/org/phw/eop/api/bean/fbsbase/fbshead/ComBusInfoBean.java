package org.phw.eop.api.bean.fbsbase.fbshead;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;
import org.phw.eop.api.internal.mapping.annotation.RspField;

@EopBean
public class ComBusInfoBean {

    @ReqField(tagName = "OPER_ID")
    @RspField(tagName = "OPER_ID")
    private String operId;

    @ReqField(tagName = "PROVINCE_CODE")
    @RspField(tagName = "PROVINCE_CODE")
    private String provinceCode;

    @ReqField(tagName = "EPARCHY_CODE")
    @RspField(tagName = "EPARCHY_CODE")
    private String eparchyCode;

    @ReqField(tagName = "CITY_CODE")
    @RspField(tagName = "CITY_CODE")
    private String cityCode;

    @ReqField(tagName = "CHANNEL_ID")
    @RspField(tagName = "CHANNEL_ID")
    private String channelId;

    @ReqField(tagName = "CHANNEL_TYPE")
    @RspField(tagName = "CHANNEL_TYPE")
    private String channelType;

    @ReqField(tagName = "ACCESS_TYPE")
    @RspField(tagName = "ACCESS_TYPE")
    private String accessType;

    @ReqField(tagName = "ORDER_TYPE")
    @RspField(tagName = "ORDER_TYPE")
    private String orderType;

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
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

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

}
