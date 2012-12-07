package org.phw.eop.api.bean.querysnuser.rsp;

import java.util.List;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class UserInfoBean {

    @RspField(tagName = "USER_ID")
    private String userId;

    @RspField(tagName = "SERVICE_CLASS_CODE")
    private String serviceClassCode;

    @RspField(tagName = "USER_STATE")
    private String userState;

    @RspField(tagName = "BRAND_CODE")
    private String brandCode;

    @RspField(tagName = "PROVINCE_CODE")
    private String provinceCode;

    @RspField(tagName = "EPARCHY_CODE")
    private String eparchyCode;

    @RspField(tagName = "CITY_CODE")
    private String cityCode;

    @RspField(tagName = "OPEN_DATE")
    private String openDate;

    @RspField(tagName = "ACTIVATION_DATA")
    private String activationData;

    @RspField(tagName = "LAND_LEVLE")
    private String landLevel;

    @RspField(tagName = "ROAM_STAT")
    private String roamStat;

    @RspField(tagName = "PRODUCT_ID")
    private String productId;

    @RspField(tagName = "PRODUCT_NAME")
    private String productName;

    @RspField(tagName = "NEXT_PRODUCT_ID")
    private String nextProductId;

    @RspField(tagName = "NEXT_PRODUCT_NAME")
    private String nextProductName;

    @RspField(tagName = "SUBSCRB_TYPE")
    private String subscrbType;

    @RspField(tagName = "INTENET_TYPE")
    private String intenetType;

    @RspField(tagName = "USER_SCORE_AMOUNT")
    private String userScoreAmount;

    @RspField(tagName = "LEAD_CODE")
    private String leadCode;

    @RspField(tagName = "COMP_FLAG")
    private String compFlag;

    @RspField(tagName = "NETCARD_FLAG")
    private String netcardFlag;

    @RspField(tagName = "SAME_LINE_INFO")
    private List<SameLineInfoBean> sameLineInfo;

    @RspField(tagName = "SIM_CARD_NO")
    private String simCardNo;

    @RspField(tagName = "IMSI")
    private String imsi;

    @RspField(tagName = "FLAG_3G")
    private String flag3g;

    @RspField(tagName = "PRODUCT_INFO")
    private List<ProductInfoBean> productInfo;

    @RspField(tagName = "ACTIVITY_INFO")
    private List<ActivityInfoBean> activityInfo;

    @RspField(tagName = "VPN_NAME")
    private String vpnName;

    @RspField(tagName = "BASIC_CREDIT_VALUE")
    private String basicCreditValue;

    @RspField(tagName = "CREDIT_VALUE")
    private String creditValue;

    @RspField(tagName = "CREDIT_RULE_ID")
    private String creditRuleId;

    @RspField(tagName = "ARREARAGE_FEE_INFO")
    private ArrearageFeeInfoBean arrearageFeeInfo;

    @RspField(tagName = "ATTR_INFO")
    private List<AttrInfoBean> attrInfo;

    @RspField(tagName = "RESOUREC_INFO")
    private ResourceInfoBean resourceInfo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getServiceClassCode() {
        return serviceClassCode;
    }

    public void setServiceClassCode(String serviceClassCode) {
        this.serviceClassCode = serviceClassCode;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
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

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getActivationData() {
        return activationData;
    }

    public void setActivationData(String activationData) {
        this.activationData = activationData;
    }

    public String getLandLevel() {
        return landLevel;
    }

    public void setLandLevel(String landLevel) {
        this.landLevel = landLevel;
    }

    public String getRoamStat() {
        return roamStat;
    }

    public void setRoamStat(String roamStat) {
        this.roamStat = roamStat;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getNextProductId() {
        return nextProductId;
    }

    public void setNextProductId(String nextProductId) {
        this.nextProductId = nextProductId;
    }

    public String getNextProductName() {
        return nextProductName;
    }

    public void setNextProductName(String nextProductName) {
        this.nextProductName = nextProductName;
    }

    public String getSubscrbType() {
        return subscrbType;
    }

    public void setSubscrbType(String subscrbType) {
        this.subscrbType = subscrbType;
    }

    public String getIntenetType() {
        return intenetType;
    }

    public void setIntenetType(String intenetType) {
        this.intenetType = intenetType;
    }

    public String getUserScoreAmount() {
        return userScoreAmount;
    }

    public void setUserScoreAmount(String userScoreAmount) {
        this.userScoreAmount = userScoreAmount;
    }

    public String getLeadCode() {
        return leadCode;
    }

    public void setLeadCode(String leadCode) {
        this.leadCode = leadCode;
    }

    public String getCompFlag() {
        return compFlag;
    }

    public void setCompFlag(String compFlag) {
        this.compFlag = compFlag;
    }

    public String getNetcardFlag() {
        return netcardFlag;
    }

    public void setNetcardFlag(String netcardFlag) {
        this.netcardFlag = netcardFlag;
    }

    public List<SameLineInfoBean> getSameLineInfo() {
        return sameLineInfo;
    }

    public void setSameLineInfo(List<SameLineInfoBean> sameLineInfo) {
        this.sameLineInfo = sameLineInfo;
    }

    public String getSimCardNo() {
        return simCardNo;
    }

    public void setSimCardNo(String simCardNo) {
        this.simCardNo = simCardNo;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getFlag3g() {
        return flag3g;
    }

    public void setFlag3g(String flag3g) {
        this.flag3g = flag3g;
    }

    public List<ProductInfoBean> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(List<ProductInfoBean> productInfo) {
        this.productInfo = productInfo;
    }

    public List<ActivityInfoBean> getActivityInfo() {
        return activityInfo;
    }

    public void setActivityInfo(List<ActivityInfoBean> activityInfo) {
        this.activityInfo = activityInfo;
    }

    public String getVpnName() {
        return vpnName;
    }

    public void setVpnName(String vpnName) {
        this.vpnName = vpnName;
    }

    public String getBasicCreditValue() {
        return basicCreditValue;
    }

    public void setBasicCreditValue(String basicCreditValue) {
        this.basicCreditValue = basicCreditValue;
    }

    public String getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(String creditValue) {
        this.creditValue = creditValue;
    }

    public String getCreditRuleId() {
        return creditRuleId;
    }

    public void setCreditRuleId(String creditRuleId) {
        this.creditRuleId = creditRuleId;
    }

    public ArrearageFeeInfoBean getArrearageFeeInfo() {
        return arrearageFeeInfo;
    }

    public void setArrearageFeeInfo(ArrearageFeeInfoBean arrearageFeeInfo) {
        this.arrearageFeeInfo = arrearageFeeInfo;
    }

    public List<AttrInfoBean> getAttrInfo() {
        return attrInfo;
    }

    public void setAttrInfo(List<AttrInfoBean> attrInfo) {
        this.attrInfo = attrInfo;
    }

    public ResourceInfoBean getResourceInfo() {
        return resourceInfo;
    }

    public void setResourceInfo(ResourceInfoBean resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

}
