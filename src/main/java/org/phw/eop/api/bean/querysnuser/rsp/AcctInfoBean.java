package org.phw.eop.api.bean.querysnuser.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class AcctInfoBean {

    @RspField(tagName = "ACCT_ID")
    private String acctId;

    @RspField(tagName = "CUST_ID")
    private String custId;

    @RspField(tagName = "DEBUTY_USER_ID")
    private String debutyUserId;

    @RspField(tagName = "DEBUTY_CODE")
    private String debutyCode;

    @RspField(tagName = "PAY_NAME")
    private String payName;

    @RspField(tagName = "PAY_MODE_CODE")
    private String payModeCode;

    @RspField(tagName = "PREPAY_TAG")
    private String prepayTag;

    @RspField(tagName = "ACCOUNT_CYCLE")
    private String accountCycle;

    @RspField(tagName = "IS_GROUP_ACCT")
    private String isGroupAcct;

    @RspField(tagName = "CONSIGN")
    private ConsignBean consign;

    @RspField(tagName = "SCORE_VALUE")
    private String scoreValue;

    @RspField(tagName = "CONTRACT_NO")
    private String contractNo;

    @RspField(tagName = "OPEN_DATE")
    private String openDate;

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getDebutyUserId() {
        return debutyUserId;
    }

    public void setDebutyUserId(String debutyUserId) {
        this.debutyUserId = debutyUserId;
    }

    public String getDebutyCode() {
        return debutyCode;
    }

    public void setDebutyCode(String debutyCode) {
        this.debutyCode = debutyCode;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getPayModeCode() {
        return payModeCode;
    }

    public void setPayModeCode(String payModeCode) {
        this.payModeCode = payModeCode;
    }

    public String getPrepayTag() {
        return prepayTag;
    }

    public void setPrepayTag(String prepayTag) {
        this.prepayTag = prepayTag;
    }

    public String getAccountCycle() {
        return accountCycle;
    }

    public void setAccountCycle(String accountCycle) {
        this.accountCycle = accountCycle;
    }

    public String getIsGroupAcct() {
        return isGroupAcct;
    }

    public void setIsGroupAcct(String isGroupAcct) {
        this.isGroupAcct = isGroupAcct;
    }

    public ConsignBean getConsign() {
        return consign;
    }

    public void setConsign(ConsignBean consign) {
        this.consign = consign;
    }

    public String getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(String scoreValue) {
        this.scoreValue = scoreValue;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

}
