package org.phw.eop.api.bean.checkstaff.rsp;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class CheckStaffRspBody implements Serializable {

    private static final long serialVersionUID = -4094362535711586922L;

    private String respCode;

    private String operatorID;

    private String province;

    private String city;

    private String district;

    private String channelID;

    private String channelType;

    private String channelName;
    private String departId;
    private String departName;

    private StaffInfoBean staffInfo;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public StaffInfoBean getStaffInfo() {
        return staffInfo;
    }

    public void setStaffInfo(StaffInfoBean staffInfo) {
        this.staffInfo = staffInfo;
    }

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

    public String getDepartId() {
        return departId;
    }
    public void setDepartId(String departId) {
        this.departId = departId;
    }
    public String getDepartName() {
        return departName;
    }
    public void setDepartName(String departName) {
        this.departName = departName;
    }
}
