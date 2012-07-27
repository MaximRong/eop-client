package org.phw.eop.api.bean.accountreq.rsp;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.RspField;

public class AccountReqRspBody {

    @RspField(tagName = "RespCode")
    private String respCode;

    @RspField(tagName = "RespDesc")
    private String respDesc;

    @RspField(tagName = "ProvOrderID")
    private String provOrderID;

    @RspField(tagName = "NewTradeCon")
    private String newTradeCon;

    @RspField(tagName = "FeeInfo")
    private List<FeeInfoBean> feeInfo;

    @RspField(tagName = "TotalFee")
    private String totalFee;

    @RspField(tagName = "AcceptanceTp")
    private String acceptanceTp;

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

    public List<FeeInfoBean> getFeeInfo() {
        return feeInfo;
    }

    public void setFeeInfo(List<FeeInfoBean> feeInfo) {
        this.feeInfo = feeInfo;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getAcceptanceTp() {
        return acceptanceTp;
    }

    public void setAcceptanceTp(String acceptanceTp) {
        this.acceptanceTp = acceptanceTp;
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
