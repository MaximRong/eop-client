package org.phw.eop.api.bean.account.req;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class AccountReqBody {

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

    @ReqField(tagName = "RecomPersonID")
    private String recomPersonID;

    @ReqField(tagName = "RecomPersonName")
    private String recomPersonName;

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

    public String getRecomPersonID() {
        return recomPersonID;
    }

    public void setRecomPersonID(String recomPersonID) {
        this.recomPersonID = recomPersonID;
    }

    public String getRecomPersonName() {
        return recomPersonName;
    }

    public void setRecomPersonName(String recomPersonName) {
        this.recomPersonName = recomPersonName;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }
}
