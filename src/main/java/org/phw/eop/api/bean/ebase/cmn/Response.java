package org.phw.eop.api.bean.ebase.cmn;

import org.n3r.core.beanverify.annotation.DefaultNotNull;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@DefaultNotNull
@EopBean(propMapping = PropMappingFieldName.class)
public class Response {

    private String rspType;
    private String rspCode;
    private String rspDesc;

    public String getRspType() {
        return rspType;
    }

    public void setRspType(String rspType) {
        this.rspType = rspType;
    }

    public String getRspCode() {
        return rspCode;
    }

    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }

    public String getRspDesc() {
        return rspDesc;
    }

    public void setRspDesc(String rspDesc) {
        this.rspDesc = rspDesc;
    }

}
