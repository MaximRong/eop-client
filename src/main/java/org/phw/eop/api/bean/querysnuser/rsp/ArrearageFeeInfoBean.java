package org.phw.eop.api.bean.querysnuser.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;


public class ArrearageFeeInfoBean{

    @RspField(tagName = "DEPOSIT_MONEY")
    private String depositMoney;
    
    @RspField(tagName = "BALANCE_BEFORE_LAST")
    private String balanceBeforeLast;
    
    @RspField(tagName = "LAST_BALANCE")
    private String lastbalance;
    
    @RspField(tagName = "FEE")
    private String fee;

    public String getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(String depositMoney) {
        this.depositMoney = depositMoney;
    }

    public String getBalanceBeforeLast() {
        return balanceBeforeLast;
    }

    public void setBalanceBeforeLast(String balanceBeforeLast) {
        this.balanceBeforeLast = balanceBeforeLast;
    }

    public String getLastbalance() {
        return lastbalance;
    }

    public void setLastbalance(String lastbalance) {
        this.lastbalance = lastbalance;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

}
