package org.phw.eop.api.bean.fbsbase.fbshead;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;
import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 全业务应报文头ResponseBean。
 * 
 * @author Lurker
 * 
 */
@EopBean
public class ResponseBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @ReqField(tagName = "RSP_TYPE")
    @RspField(tagName = "RSP_TYPE")
    private String rspType;

    @ReqField(tagName = "RSP_CODE")
    @RspField(tagName = "RSP_CODE")
    private String rspCode;

    @ReqField(tagName = "RSP_DESC")
    @RspField(tagName = "RSP_DESC")
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
