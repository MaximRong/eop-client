package org.phw.eop.api.bean.checkcust.req;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 校验客户资料信息接口的请求报文体。
 * @author xrx
 */
public class CheckCustReqBody {

    @ReqField(mappedOut = true)
    private OperBean oper;

    @ReqField(tagName = "Para")
    private List<ParaBean> para;

    public OperBean getOper() {
        return oper;
    }

    public void setOper(OperBean oper) {
        this.oper = oper;
    }

    @ReqField(tagName = "CertType")
    private String certType;

    @ReqField(tagName = "SerType")
    private String serType;

    @ReqField(tagName = "CertNum")
    private String certNum;

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public String getSerType() {
        return serType;
    }

    public void setSerType(String serType) {
        this.serType = serType;
    }

}
