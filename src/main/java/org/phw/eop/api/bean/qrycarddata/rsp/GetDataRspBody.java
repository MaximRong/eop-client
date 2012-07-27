package org.phw.eop.api.bean.qrycarddata.rsp;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 写卡数据查询接口 应答报文体
 * @author lita
 *
 */
public class GetDataRspBody implements Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "RespCode")
    private String respCode;

    @RspField(tagName = "RespDesc")
    private String respDesc;

    @RspField(tagName = "ProcId")
    private String procId;

    @RspField(tagName = "ActiveId")
    private String activeId;

    @RspField(tagName = "ICCID")
    private String iccId;

    @RspField(tagName = "IMSI")
    private String imsi;

    @RspField(tagName = "ScriptSeq")
    private String scriptSeq;

    @RspField(tagName = "CardData")
    private String cardData;

    @RspField(tagName = "ReservPara")
    private String reservPara;

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

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getScriptSeq() {
        return scriptSeq;
    }

    public void setScriptSeq(String scriptSeq) {
        this.scriptSeq = scriptSeq;
    }

    public String getCardData() {
        return cardData;
    }

    public void setCardData(String cardData) {
        this.cardData = cardData;
    }

    public String getReservPara() {
        return reservPara;
    }

    public void setReservPara(String reservPara) {
        this.reservPara = reservPara;
    }
}
