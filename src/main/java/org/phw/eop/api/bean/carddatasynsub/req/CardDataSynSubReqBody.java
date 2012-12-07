package org.phw.eop.api.bean.carddatasynsub.req;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 卡数据同步提交接口 - 请求body
 * @author janis
 *
 */
public class CardDataSynSubReqBody {

    @ReqField(mappedOut = true)
    private OperBean oper;

    @ReqField(tagName = "OrdersID")
    private String ordersID;

    @ReqField(tagName = "ProvOrderID")
    private String provOrderID;

    @ReqField(tagName = "NumID")
    private String numID;

    @ReqField(tagName = "SimCardNo")
    private List<SimCardNoBean> simCardNo;

    @ReqField(tagName = "TaxBatchNo")
    private String taxBatchNo;

    @ReqField(tagName = "InvoiceNo")
    private String invoiceNo;

    @ReqField(tagName = "TaxType")
    private String taxType;

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

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String getTaxBatchNo() {
        return taxBatchNo;
    }

    public void setTaxBatchNo(String taxBatchNo) {
        this.taxBatchNo = taxBatchNo;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

}
