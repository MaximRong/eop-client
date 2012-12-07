package org.phw.eop.api.bean.querysnuser.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class ConsignBean {

    @RspField(tagName = "CONSIGN_MODE")
    private String consignMode;

    @RspField(tagName = "SUPER_BANK_CODE")
    private String superBankCode;

    @RspField(tagName = "BANK_CODE")
    private String bankCode;

    @RspField(tagName = "BANK_ACCT_NO")
    private String bankAcctNo;

    @RspField(tagName = "AGREEMENT_NO")
    private String agreementNo;

    @RspField(tagName = "ACCT_BALANCE_ID")
    private String acctBalanceId;

    @RspField(tagName = "BANK_ACCT_NAME")
    private String bankAcctName;

    public String getConsignMode() {
        return consignMode;
    }

    public void setConsignMode(String consignMode) {
        this.consignMode = consignMode;
    }

    public String getSuperBankCode() {
        return superBankCode;
    }

    public void setSuperBankCode(String superBankCode) {
        this.superBankCode = superBankCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankAcctNo() {
        return bankAcctNo;
    }

    public void setBankAcctNo(String bankAcctNo) {
        this.bankAcctNo = bankAcctNo;
    }

    public String getAgreementNo() {
        return agreementNo;
    }

    public void setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
    }

    public String getAcctBalanceId() {
        return acctBalanceId;
    }

    public void setAcctBalanceId(String acctBalanceId) {
        this.acctBalanceId = acctBalanceId;
    }

    public String getBankAcctName() {
        return bankAcctName;
    }

    public void setBankAcctName(String bankAcctName) {
        this.bankAcctName = bankAcctName;
    }

}
