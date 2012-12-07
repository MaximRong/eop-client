package org.phw.eop.api.bean.checkcustid5.sync;

import java.util.List;

import org.n3r.core.beanverify.annotation.NotNull;
import org.n3r.core.xml.annotation.RXRootElement;
import org.n3r.core.xml.annotation.RXSkip;
import org.n3r.core.xml.utils.RXSkipWhen;
import org.phw.eop.api.bean.ebase.cmn.Para;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@EopBean(propMapping = PropMappingFieldName.class)
@RXRootElement("SynDataReq")
public class IdInfoSyncReqBody {

    @RXSkip(RXSkipWhen.Null)
    private String operatorID;
    @NotNull
    private String province;
    @NotNull
    private String city;
    @RXSkip(RXSkipWhen.Null)
    private String district;
    @RXSkip(RXSkipWhen.Null)
    private String channelID;
    @RXSkip(RXSkipWhen.Null)
    private String channelType;
    @NotNull
    private String accessType;
    @NotNull
    private String custId;
    @NotNull
    private String custName;
    @NotNull
    @RXSkip(RXSkipWhen.Null)
    private String photo;
    @NotNull
    @RXSkip(RXSkipWhen.Null)
    private String gender;
    @NotNull
    @RXSkip(RXSkipWhen.Null)
    private String birthday;
    @NotNull
    @RXSkip(RXSkipWhen.Null)
    private String nationality;
    @RXSkip(RXSkipWhen.Null)
    private String address;
    @RXSkip(RXSkipWhen.Null)
    private String validityPeriod;
    @RXSkip(RXSkipWhen.Null)
    private String licenceIssAuth;
    @RXSkip(RXSkipWhen.Null)
    private String cardReaderId;
    private List<Para> paras;

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

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public String getLicenceIssAuth() {
        return licenceIssAuth;
    }

    public void setLicenceIssAuth(String licenceIssAuth) {
        this.licenceIssAuth = licenceIssAuth;
    }

    public String getCardReaderId() {
        return cardReaderId;
    }

    public void setCardReaderId(String cardReaderId) {
        this.cardReaderId = cardReaderId;
    }

    public List<Para> getParas() {
        return paras;
    }

    public void setParas(List<Para> paras) {
        this.paras = paras;
    }

}
