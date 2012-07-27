package org.phw.eop.api.bean.accountreq.req;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class AccountReqReqBody {

    @ReqField(mappedOut = true)
    private OperBean oper;

    @ReqField(tagName = "OrdersID")
    private String ordersID;

    @ReqField(tagName = "NewTradeCon")
    private String newTradeCon;

    @ReqField(tagName = "ProvOrderID")
    private String provOrderID;

    @ReqField(tagName = "NumID")
    private List<NumIDBean> numID;

    @ReqField(tagName = "SimCardNo")
    private List<SimCardNoBean> simCardNo;

    @ReqField(tagName = "CustomerInfo")
    private List<CustomerInfoBean> customerInfo;

    @ReqField(tagName = "AcctInfo")
    private List<AcctInfoBean> acctInfo;

    @ReqField(tagName = "UserInfo")
    private List<UserInfoBean> userInfo;

    @ReqField(tagName = "FeeInfo")
    private List<FeeInfoBean> reeInfo;

    @ReqField(tagName = "OrigTotalFee")
    private String origTotalFee;

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

    public List<NumIDBean> getNumID() {
        return numID;
    }

    public void setNumID(List<NumIDBean> numID) {
        this.numID = numID;
    }

    public List<SimCardNoBean> getSimCardNo() {
        return simCardNo;
    }

    public void setSimCardNo(List<SimCardNoBean> simCardNo) {
        this.simCardNo = simCardNo;
    }

    public List<CustomerInfoBean> getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(List<CustomerInfoBean> customerInfo) {
        this.customerInfo = customerInfo;
    }

    public List<AcctInfoBean> getAcctInfo() {
        return acctInfo;
    }

    public void setAcctInfo(List<AcctInfoBean> acctInfo) {
        this.acctInfo = acctInfo;
    }

    public List<UserInfoBean> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<UserInfoBean> userInfo) {
        this.userInfo = userInfo;
    }

    public List<FeeInfoBean> getReeInfo() {
        return reeInfo;
    }

    public void setReeInfo(List<FeeInfoBean> reeInfo) {
        this.reeInfo = reeInfo;
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
}
