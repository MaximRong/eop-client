package org.phw.eop.api.bean.querysnuser.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class VipCustInfoBean {

    @RspField(tagName = "VIP_ID")
    private String vipId;
    
    @RspField(tagName = "USER_ID")
    private String userId;
    
    @RspField(tagName = "CUST_MANAGER_NUMBER")
    private String custManagerNumber;
    
    @RspField(tagName = "VIP_TYPE_CODE")
    private String vipTypeCode;
    
    @RspField(tagName = "VIP_CLASS_ID")
    private String vipClassId;
    
    @RspField(tagName = "CLASS_CHANGE_DATE")
    private String classChangeDate;
    
    @RspField(tagName = "VIP_CARD_INFO")
    private String vipCardInfo;
    
    @RspField(tagName = "VIP_CARD_NO")
    private String vipCardNo;
    
    @RspField(tagName = "VIP_CARD_TYPE")
    private String vipCardType;
    
    @RspField(tagName = "VIP_CARD_STATE")
    private String vipCardState;
    
    @RspField(tagName = "VIP_CARD_START_DATE")
    private String vipCardStartDate;
    
    @RspField(tagName = "VIP_CARD_END_DATE")
    private String vipCardEndDate;
    
    @RspField(tagName = "VIP_CARD_CHANGE_DATE")
    private String vipCardChangeDate;
    
    @RspField(tagName = "VIP_CARD_CHANGE_REASON")
    private String vipCardChangeReason;
    
    @RspField(tagName = "CUST_MANAGER_ID")
    private String custManagerId;
    
    @RspField(tagName = "CUST_MANAGER_ID_B")
    private String custManagerIdB;

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCustManagerNumber() {
        return custManagerNumber;
    }

    public void setCustManagerNumber(String custManagerNumber) {
        this.custManagerNumber = custManagerNumber;
    }

    public String getVipTypeCode() {
        return vipTypeCode;
    }

    public void setVipTypeCode(String vipTypeCode) {
        this.vipTypeCode = vipTypeCode;
    }

    public String getVipClassId() {
        return vipClassId;
    }

    public void setVipClassId(String vipClassId) {
        this.vipClassId = vipClassId;
    }

    public String getClassChangeDate() {
        return classChangeDate;
    }

    public void setClassChangeDate(String classChangeDate) {
        this.classChangeDate = classChangeDate;
    }

    public String getVipCardInfo() {
        return vipCardInfo;
    }

    public void setVipCardInfo(String vipCardInfo) {
        this.vipCardInfo = vipCardInfo;
    }

    public String getVipCardNo() {
        return vipCardNo;
    }

    public void setVipCardNo(String vipCardNo) {
        this.vipCardNo = vipCardNo;
    }

    public String getVipCardType() {
        return vipCardType;
    }

    public void setVipCardType(String vipCardType) {
        this.vipCardType = vipCardType;
    }

    public String getVipCardState() {
        return vipCardState;
    }

    public void setVipCardState(String vipCardState) {
        this.vipCardState = vipCardState;
    }

    public String getVipCardStartDate() {
        return vipCardStartDate;
    }

    public void setVipCardStartDate(String vipCardStartDate) {
        this.vipCardStartDate = vipCardStartDate;
    }

    public String getVipCardEndDate() {
        return vipCardEndDate;
    }

    public void setVipCardEndDate(String vipCardEndDate) {
        this.vipCardEndDate = vipCardEndDate;
    }

    public String getVipCardChangeDate() {
        return vipCardChangeDate;
    }

    public void setVipCardChangeDate(String vipCardChangeDate) {
        this.vipCardChangeDate = vipCardChangeDate;
    }

    public String getVipCardChangeReason() {
        return vipCardChangeReason;
    }

    public void setVipCardChangeReason(String vipCardChangeReason) {
        this.vipCardChangeReason = vipCardChangeReason;
    }

    public String getCustManagerId() {
        return custManagerId;
    }

    public void setCustManagerId(String custManagerId) {
        this.custManagerId = custManagerId;
    }

    public String getCustManagerIdB() {
        return custManagerIdB;
    }

    public void setCustManagerIdB(String custManagerIdB) {
        this.custManagerIdB = custManagerIdB;
    }

}
