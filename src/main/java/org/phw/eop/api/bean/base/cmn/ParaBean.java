package org.phw.eop.api.bean.base.cmn;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 预留参数信息。
 *
 * @author wanglei
 *
 * 2012-1-9
 */
@EopBean
public class ParaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String paraID;

    private String paraValue;

    public String getParaID() {
        return paraID;
    }

    public String getParaValue() {
        return paraValue;
    }

    public void setParaValue(String paraValue) {
        this.paraValue = paraValue;
    }

    public void setParaID(String paraID) {
        this.paraID = paraID;
    }
}
