package org.phw.eop.api.bean.oldusercheck.req;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class ActParaBean implements Serializable {
    private static final long serialVersionUID = 1L;

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
