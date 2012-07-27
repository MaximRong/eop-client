package org.phw.eop.api.bean.checkstaff.req;

import java.io.Serializable;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

@EopBean
public class CheckStaffReqBody implements Serializable{

    private static final long serialVersionUID = -3152575298804386151L;
    
    @ReqField(mappedOut = true)
    private OperBean oper;
    
    private String checkMode;

    public OperBean getOper() {
        return oper;
    }

    public void setOper(OperBean oper) {
        this.oper = oper;
    }

    public String getCheckMode() {
        return checkMode;
    }

    public void setCheckMode(String checkMode) {
        this.checkMode = checkMode;
    }
}
