package org.phw.eop.api.bean.ebase.cmn;

import org.n3r.core.beanverify.annotation.DefaultNotNull;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@DefaultNotNull
@EopBean(propMapping = PropMappingFieldName.class)
public class Para {

    private String paraID;
    private String paraValue;

    public void setParaID(String paraID) {
        this.paraID = paraID;
    }

    public String getParaID() {
        return paraID;
    }

    public void setParaValue(String paraValue) {
        this.paraValue = paraValue;
    }

    public String getParaValue() {
        return paraValue;
    }

}
