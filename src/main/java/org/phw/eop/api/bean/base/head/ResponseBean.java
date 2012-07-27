package org.phw.eop.api.bean.base.head;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 响应报文头ResponseBean。
 *
 * @author wanglei
 *
 * 2012-1-10
 */
@EopBean
public class ResponseBean implements Serializable {

    private static final long serialVersionUID = 1L;

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
