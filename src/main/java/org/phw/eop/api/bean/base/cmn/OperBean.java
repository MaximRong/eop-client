package org.phw.eop.api.bean.base.cmn;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 员工信息Bean。
 *
 * @author wanglei
 *
 * 2012-1-9
 */
@EopBean
public class OperBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String operatorID;

    private String province;

    private String city;

    private String district;

    private String channelID;

    private String channelType;

    private String accessType;

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getChannelID() {
        return channelID;
    }

    public void setChannelID(String channelID) {
        this.channelID = channelID;
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
}
