package org.phw.eop.api.bean.accountcommit.req;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 开户提交接口请求报文体.
 * @author lita
 *
 */
public class AccountCommitReqBody {

    @ReqField(mappedOut = true)
    private OperBean oper;

    @ReqField(tagName = "SysCode")
    private String sysCode;

    @ReqField(tagName = "OrdersID")
    private String ordersID;

    @ReqField(tagName = "NewTradeCon")
    private String newTradeCon;

    @ReqField(tagName = "ProvOrderID")
    private String provOrderID;

    @ReqField(tagName = "SimCardNo")
    private List<SimCardNoBean> simCardNo;

    @ReqField(tagName = "FeeInfo")
    private List<FeeInfoBean> feeInfo;

    @ReqField(tagName = "OrigTotalFee")
    private String origTotalFee;

    @ReqField(tagName = "InvoiceNo")
    private String invoiceNo;

    @ReqField(tagName = "PayInfo")
    private List<PayInfoBean> payInfo;

    @ReqField(tagName = "AcceptanceReqTag")
    private String acceptanceReqTag;

    @ReqField(tagName = "Para")
    private List<ParaBean> para;

    public OperBean getOper() {
        return oper;
    }

    public void setOper(OperBean oper) {
        this.oper = oper;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getOrdersID() {
        return ordersID;
    }

    public void setOrdersID(String ordersID) {
        this.ordersID = ordersID;
    }

    public String getNewTradeCon() {
        return newTradeCon;
    }

    public void setNewTradeCon(String newTradeCon) {
        this.newTradeCon = newTradeCon;
    }

    public String getProvOrderID() {
        return provOrderID;
    }

    public void setProvOrderID(String provOrderID) {
        this.provOrderID = provOrderID;
    }

    public List<SimCardNoBean> getSimCardNo() {
        return simCardNo;
    }

    public void setSimCardNo(List<SimCardNoBean> simCardNo) {
        this.simCardNo = simCardNo;
    }

    public List<FeeInfoBean> getFeeInfo() {
        return feeInfo;
    }

    public void setFeeInfo(List<FeeInfoBean> feeInfo) {
        this.feeInfo = feeInfo;
    }

    public String getOrigTotalFee() {
        return origTotalFee;
    }

    public void setOrigTotalFee(String origTotalFee) {
        this.origTotalFee = origTotalFee;
    }

    public List<PayInfoBean> getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(List<PayInfoBean> payInfo) {
        this.payInfo = payInfo;
    }

    public String getAcceptanceReqTag() {
        return acceptanceReqTag;
    }

    public void setAcceptanceReqTag(String acceptanceReqTag) {
        this.acceptanceReqTag = acceptanceReqTag;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

}
