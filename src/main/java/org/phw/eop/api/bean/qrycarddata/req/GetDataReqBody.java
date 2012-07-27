package org.phw.eop.api.bean.qrycarddata.req;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 写卡数据查询接口 请求报文体
 * @author lita
 *
 */
public class GetDataReqBody {

    @ReqField(mappedOut = true, emptyMapped = true)
    private OperBean oper;

    @ReqField(tagName = "ReDoTag", emptyMapped = true)
    private String reDoTag;

    @ReqField(tagName = "ProcId")
    private String procId;

    @ReqField(tagName = "ActiveId")
    private String activeId;

    @ReqField(tagName = "ICCID", emptyMapped = true)
    private String iccId;

    @ReqField(tagName = "OldICCID")
    private String oldIccId;

    @ReqField(tagName = "NumID", emptyMapped = true)
    private String numId;

    @ReqField(tagName = "ErrorCode")
    private String errorCode;

    @ReqField(tagName = "ErrorComments")
    private String errorComments;

    @ReqField(tagName = "BusiType", emptyMapped = true)
    private String busiType;

    @ReqField(tagName = "CardType", emptyMapped = true)
    private String cardType;

    @ReqField(tagName = "UserType", emptyMapped = true)
    private String userType;

    @ReqField(tagName = "ReservPara")
    private String reservPara;

    public OperBean getOper() {
        return oper;
    }

    public void setOper(OperBean oper) {
        this.oper = oper;
    }

    public String getReDoTag() {
        return reDoTag;
    }

    public void setReDoTag(String reDoTag) {
        this.reDoTag = reDoTag;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getActiveId() {
        return activeId;
    }

    public void setActiveId(String activeId) {
        this.activeId = activeId;
    }

    public String getIccId() {
        return iccId;
    }

    public void setIccId(String iccId) {
        this.iccId = iccId;
    }

    public String getOldIccId() {
        return oldIccId;
    }

    public void setOldIccId(String oldIccId) {
        this.oldIccId = oldIccId;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getReservPara() {
        return reservPara;
    }

    public void setReservPara(String reservPara) {
        this.reservPara = reservPara;
    }

    public String getErrorComments() {
        return errorComments;
    }

    public void setErrorComments(String errorComments) {
        this.errorComments = errorComments;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
