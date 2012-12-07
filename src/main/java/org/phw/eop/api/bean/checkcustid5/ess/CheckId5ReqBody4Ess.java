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
@RXRootElement("CheckCustReq")
public class CheckId5ReqBody4Ess {

    @NotNull
    private String accessType;
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
    private String checkType;
    @NotNull
    private String checkCustId;
    @NotNull
    private String checkCustName;
    private List<Para> paras;

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
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

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public String getCheckCustId() {
        return checkCustId;
    }

    public void setCheckCustId(String checkCustId) {
        this.checkCustId = checkCustId;
    }

    public String getCheckCustName() {
        return checkCustName;
    }

    public void setCheckCustName(String checkCustName) {
        this.checkCustName = checkCustName;
    }

    public List<Para> getParas() {
        return paras;
    }

    public void setParas(List<Para> paras) {
        this.paras = paras;
    }

}
