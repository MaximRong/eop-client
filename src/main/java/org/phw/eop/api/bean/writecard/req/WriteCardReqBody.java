package org.phw.eop.api.bean.writecard.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 写卡结果通知接口 请求报文体
 * @author lita
 *
 */
public class WriteCardReqBody {

    @ReqField(tagName = "ProcId")
    private String procId;

    @ReqField(tagName = "ActiveId", emptyMapped = true)
    private String activeId;

    @ReqField(tagName = "ICCID", emptyMapped = true)
    private String iccId;

    @ReqField(tagName = "ErrorICCID")
    private String errorIccId;

    @ReqField(tagName = "IMSI")
    private String imsi;

    @ReqField(tagName = "ReasonID", emptyMapped = true)
    private String reasonID;

    @ReqField(tagName = "ErrorComments")
    private String errorComments;

    @ReqField(tagName = "ReservPara")
    private String reservPara;

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

    public String getErrorIccId() {
        return errorIccId;
    }

    public void setErrorIccId(String errorIccId) {
        this.errorIccId = errorIccId;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getReasonID() {
        return reasonID;
    }

    public void setReasonID(String reasonID) {
        this.reasonID = reasonID;
    }

    public String getErrorComments() {
        return errorComments;
    }

    public void setErrorComments(String errorComments) {
        this.errorComments = errorComments;
    }

    public String getReservPara() {
        return reservPara;
    }

    public void setReservPara(String reservPara) {
        this.reservPara = reservPara;
    }

}
