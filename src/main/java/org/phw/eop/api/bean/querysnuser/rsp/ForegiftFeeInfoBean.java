package org.phw.eop.api.bean.querysnuser.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class ForegiftFeeInfoBean {

    @RspField(tagName = "FOREGIFT_FEE_ID")
    private String foregiftFeeId;

    @RspField(tagName = "FOREGIFT_FEE_NAME")
    private String foregiftFeeName;

    @RspField(tagName = "FOREGIFT_FEE_VALUE")
    private String foregiftFeeValue;

    @RspField(tagName = "CAN_CANCEL_TIME")
    private String canCancelTime;

    public String getForegiftFeeId() {
        return foregiftFeeId;
    }

    public void setForegiftFeeId(String foregiftFeeId) {
        this.foregiftFeeId = foregiftFeeId;
    }

    public String getForegiftFeeName() {
        return foregiftFeeName;
    }

    public void setForegiftFeeName(String foregiftFeeName) {
        this.foregiftFeeName = foregiftFeeName;
    }

    public String getForegiftFeeValue() {
        return foregiftFeeValue;
    }

    public void setForegiftFeeValue(String foregiftFeeValue) {
        this.foregiftFeeValue = foregiftFeeValue;
    }

    public String getCanCancelTime() {
        return canCancelTime;
    }

    public void setCanCancelTime(String canCancelTime) {
        this.canCancelTime = canCancelTime;
    }

}
