package org.phw.eop.api.bean.account.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class ActParaBean {

    @ReqField(tagName = "ActParaID")
    private String actParaID;

    @ReqField(tagName = "ActParaValue")
    private String actParaValue;

    public String getActParaID() {
        return actParaID;
    }

    public void setActParaID(String actParaID) {
        this.actParaID = actParaID;
    }

    public String getActParaValue() {
        return actParaValue;
    }

    public void setActParaValue(String actParaValue) {
        this.actParaValue = actParaValue;
    }

}
