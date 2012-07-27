package org.phw.eop.api.bean.accountreq.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class FeeInfoBean {

    @RspField(tagName = "FeeID")
    private String feeID;

    @RspField(tagName = "FeeCategory")
    private String feeCategory;

    @RspField(tagName = "FeeDes")
    private String feeDes;

    @RspField(tagName = "MaxRelief")
    private String maxRelief;

    @RspField(tagName = "OrigFee")
    private String origFee;

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

    public String getMaxRelief() {
        return maxRelief;
    }

    public void setMaxRelief(String maxRelief) {
        this.maxRelief = maxRelief;
    }

    public String getOrigFee() {
        return origFee;
    }

    public void setOrigFee(String origFee) {
        this.origFee = origFee;
    }
}
