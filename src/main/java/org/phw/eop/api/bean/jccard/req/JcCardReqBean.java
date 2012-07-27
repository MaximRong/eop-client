package org.phw.eop.api.bean.jccard.req;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

/**
 * JAVA卡平台请求报文bean.
 * @author maxim
 *
 */
@EopBean(propMapping = PropMappingFieldName.class)
public class JcCardReqBean extends JcCardBean {

    // 操作员工ID
    private String operatorID;

    // 省份
    private String province;

    // 地市
    private String city;

    // 区县
    private String area;

    // 渠道编码 
    private String channel;

    // 渠道类型
    private String channelType;

    // 身份证
    private String idCard;

    // msisdn
    private String msisdn;

    // iccid
    private String iccid;

    // imsi
    private String imsi;

    // 操作类型
    private String operateType;

    // 产品数量
    private int productNum;

    // 任务类型
    private String missionType;

    // 请求数据
    private String reqData;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getMissionType() {
        return missionType;
    }

    public void setMissionType(String missionType) {
        this.missionType = missionType;
    }

    public String getReqData() {
        return reqData;
    }

    public void setReqData(String reqData) {
        this.reqData = reqData;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public int getProductNum() {
        return productNum;
    }

}