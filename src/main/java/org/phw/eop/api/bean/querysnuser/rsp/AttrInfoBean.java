package org.phw.eop.api.bean.querysnuser.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;


public class AttrInfoBean{

    @RspField(tagName = "ATTR_CODE")
    private String attrCode;
    
    @RspField(tagName = "ATTR_VALUE")
    private String attrValue;
    
    @RspField(tagName = "START_DATE")
    private String startDate;

    public String getAttrCode() {
        return attrCode;
    }

    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

}
