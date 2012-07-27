package org.phw.eop.api.bean.checkrecommend.rsp;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 推荐人信息校验接口 返回报文头体
 * @author lita
 *
 */
public class CheckRecommendRspBody implements Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "RespCode")
    private String respCode;

    @RspField(tagName = "OperatorID")
    private String operatorID;

    @RspField(tagName = "Province")
    private String province;

    @RspField(tagName = "City")
    private String city;

    @RspField(tagName = "District")
    private String district;

    @RspField(tagName = "ChannelID")
    private String channelID;

    @RspField(tagName = "ChannelType")
    private String channelType;

    @RspField(tagName = "RecomDeparID")
    private String recomDeparID;

    @RspField(tagName = "ChannelName")
    private String channelName;

    @RspField(tagName = "RecommendName")
    private String recommendName;

    @RspField(tagName = "RecommendNumber")
    private String recommendNumber;

    public String getRecommendName() {
        return recommendName;
    }

    public void setRecommendName(String recommendName) {
        this.recommendName = recommendName;
    }

    public String getRecommendNumber() {
        return recommendNumber;
    }

    public void setRecommendNumber(String recommendNumber) {
        this.recommendNumber = recommendNumber;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
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

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getRecomDeparID() {
        return recomDeparID;
    }

    public void setRecomDeparID(String recomDeparID) {
        this.recomDeparID = recomDeparID;
    }

}
