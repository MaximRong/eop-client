package org.phw.eop.api.bean.checkcustid5.ess;

import java.util.List;

import org.n3r.core.beanverify.annotation.NotNull;
import org.n3r.core.xml.annotation.RXRootElement;
import org.n3r.core.xml.annotation.RXSkip;
import org.n3r.core.xml.utils.RXSkipWhen;
import org.phw.eop.api.bean.ebase.cmn.Para;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@EopBean(propMapping = PropMappingFieldName.class)
@RXRootElement("CheckCustRsp")
public class CheckId5RspBody4Ess {

    @NotNull
    private String respCode;
    @NotNull
    private String respDesc;
    @RXSkip(RXSkipWhen.Null)
    private String photo;
    @RXSkip(RXSkipWhen.Null)
    private String gender;
    @RXSkip(RXSkipWhen.Null)
    private String birthday;
    @RXSkip(RXSkipWhen.Null)
    private String nationality;
    @RXSkip(RXSkipWhen.Null)
    private String address;
    @RXSkip(RXSkipWhen.Null)
    private String validityPeriod;
    @RXSkip(RXSkipWhen.Null)
    private String licenceIssAuth;
    private List<Para> paras;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
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

    public List<Para> getParas() {
        return paras;
    }

    public void setParas(List<Para> paras) {
        this.paras = paras;
    }

}
