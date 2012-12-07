package org.phw.eop.api.bean.querysnuser.common;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;
import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 预留参数信息。
 * 
 * @author wanglei
 * 
 *         2012-1-9
 */
@EopBean
public class FBSParaBean implements Serializable {

    private static final long serialVersionUID = 3977264962436876892L;

    @ReqField(tagName = "PARA_ID")
    @RspField(tagName = "PARA_ID")
    private String paraID;

    @ReqField(tagName = "PARA_VALUE")
    @RspField(tagName = "PARA_VALUE")
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
