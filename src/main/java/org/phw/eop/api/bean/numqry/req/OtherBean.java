package org.phw.eop.api.bean.numqry.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 号码查询接口 --Other查询条件bean
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
public class OtherBean {

    @ReqField(tagName = "OtherType")
    private String otherType;

    @ReqField(tagName = "OtherValue1")
    private String otherValue1;

    @ReqField(tagName = "OtherValue2")
    private String otherValue2;

    public String getOtherType() {
        return otherType;
    }

    public void setOtherType(String otherType) {
        this.otherType = otherType;
    }

    public String getOtherValue1() {
        return otherValue1;
    }

    public void setOtherValue1(String otherValue1) {
        this.otherValue1 = otherValue1;
    }

    public String getOtherValue2() {
        return otherValue2;
    }

    public void setOtherValue2(String otherValue2) {
        this.otherValue2 = otherValue2;
    }

}
