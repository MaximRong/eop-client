package org.phw.eop.api.bean.accountcommit.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class FeeInfoBean {

    @ReqField(tagName = "FeeID")
    private String feeID;

    @ReqField(tagName = "FeeCategory")
    private String feeCategory;

    @ReqField(tagName = "FeeDes")
    private String feeDes;

    @ReqField(tagName = "OrigFee")
    private String origFee;

    @ReqField(tagName = "ReliefFee")
    private String reliefFee;

    @ReqField(tagName = "ReliefResult")
    private String reliefResult;

    @ReqField(tagName = "RealFee")
    private String realFee;

    public String getFeeID() {
        return feeID;
    }

    public void setFeeID(String feeID) {
        this.feeID = feeID;
    }

    public String getFeeCategory() {
        return feeCategory;
    }

    public void setFeeCategory(String feeCategory) {
        this.feeCategory = feeCategory;
    }

    public String getFeeDes() {
        return feeDes;
    }

    public void setFeeDes(String feeDes) {
        this.feeDes = feeDes;
    }

    public String getOrigFee() {
        return origFee;
    }

    public void setOrigFee(String origFee) {
        this.origFee = origFee;
    }

    public String getReliefFee() {
        return reliefFee;
    }

    public void setReliefFee(String reliefFee) {
        this.reliefFee = reliefFee;
    }

    public String getReliefResult() {
        return reliefResult;
    }

    public void setReliefResult(String reliefResult) {
        this.reliefResult = reliefResult;
    }

    public String getRealFee() {
        return realFee;
    }

    public void setRealFee(String realFee) {
        this.realFee = realFee;
    }

}
