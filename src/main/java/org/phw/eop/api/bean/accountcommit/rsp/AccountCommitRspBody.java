package org.phw.eop.api.bean.accountcommit.rsp;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 开户提交接口返回报文体.
 * @author lita
 *
 */
public class AccountCommitRspBody implements Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "RespCode")
    private String respCode;

    @RspField(tagName = "RespDesc")
    private String respDesc;

    @RspField(tagName = "ProvOrderID")
    private String provOrderID;

    @RspField(tagName = "NewTradeCon")
    private String newTradeCon;

    @RspField(tagName = "InvoiceNo")
    private String invoiceNo;

    @RspField(tagName = "taxNo")
    private String taxNo;

    @RspField(tagName = "AcceptanceTp")
    private String acceptanceTp;

    @RspField(tagName = "AcceptanceMode")
    private String acceptanceMode;

    @RspField(tagName = "AcceptanceForm")
    private String acceptanceForm;

    @RspField(tagName = "Para")
    private List<ParaBean> para;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public String getProvOrderID() {
        return provOrderID;
    }

    public void setProvOrderID(String provOrderID) {
        this.provOrderID = provOrderID;
    }

    public String getNewTradeCon() {
        return newTradeCon;
    }

    public void setNewTradeCon(String newTradeCon) {
        this.newTradeCon = newTradeCon;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public String getAcceptanceTp() {
        return acceptanceTp;
    }

    public void setAcceptanceTp(String acceptanceTp) {
        this.acceptanceTp = acceptanceTp;
    }

    public String getAcceptanceMode() {
        return acceptanceMode;
    }

    public void setAcceptanceMode(String acceptanceMode) {
        this.acceptanceMode = acceptanceMode;
    }

    public String getAcceptanceForm() {
        return acceptanceForm;
    }

    public void setAcceptanceForm(String acceptanceForm) {
        this.acceptanceForm = acceptanceForm;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }
}
