package org.phw.eop.api.bean.numqry.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 号码查询接口 --预存bean
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
public class PreFeeBean {

    @ReqField(tagName = "MinFee")
    private String minFee;

    @ReqField(tagName = "MaxFee")
    private String maxFee;

    public String getMinFee() {
        return minFee;
    }

    public void setMinFee(String minFee) {
        this.minFee = minFee;
    }

    public String getMaxFee() {
        return maxFee;
    }

    public void setMaxFee(String maxFee) {
        this.maxFee = maxFee;
    }

}
