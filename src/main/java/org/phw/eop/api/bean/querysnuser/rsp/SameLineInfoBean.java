package org.phw.eop.api.bean.querysnuser.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class SameLineInfoBean {

    @RspField(tagName = "SAME_LINE_TYPE_CODE")
    private String sameLineTypeCode;

    @RspField(tagName = "SAME_LINE_AREA_CODE")
    private String sameLineAreaCode;

    @RspField(tagName = "SAME_LINE_NUMBER")
    private String sameLineNumber;

    public String getSameLineTypeCode() {
        return sameLineTypeCode;
    }

    public void setSameLineTypeCode(String sameLineTypeCode) {
        this.sameLineTypeCode = sameLineTypeCode;
    }

    public String getSameLineAreaCode() {
        return sameLineAreaCode;
    }

    public void setSameLineAreaCode(String sameLineAreaCode) {
        this.sameLineAreaCode = sameLineAreaCode;
    }

    public String getSameLineNumber() {
        return sameLineNumber;
    }

    public void setSameLineNumber(String sameLineNumber) {
        this.sameLineNumber = sameLineNumber;
    }

}
