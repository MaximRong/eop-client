package org.phw.eop.api.bean.checkolduser.req;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 活动扩展字段bean
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
@EopBean
public class ActParaBean {

    private String actParaID;

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
