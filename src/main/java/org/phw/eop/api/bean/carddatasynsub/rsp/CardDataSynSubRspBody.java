package org.phw.eop.api.bean.carddatasynsub.rsp;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 卡数据同步提交接口 - 响应body
 * @author janis
 *
 */
public class CardDataSynSubRspBody implements Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "RespCode")
    private String respCode;

    @RspField(tagName = "RespDesc")
    private String respDesc;

    @RspField(tagName = "ProvOrderID")
    private String provOrderID;

    @RspField(tagName = "TaxNo")
    private String taxNo;

    @RspField(tagName = "CardRealFee")
    private String cardRealFee;

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

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public String getCardRealFee() {
        return cardRealFee;
    }

    public void setCardRealFee(String cardRealFee) {
        this.cardRealFee = cardRealFee;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

}
