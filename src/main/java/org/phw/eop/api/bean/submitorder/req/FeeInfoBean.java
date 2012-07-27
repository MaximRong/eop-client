package org.phw.eop.api.bean.submitorder.req;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class FeeInfoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String            feeCode;

    private String            fee;

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

}
