package org.phw.eop.api.bean.checknum.rsp;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 资源信息Bean（响应）。
 * @author xrx
 */
public class ResourcesNumRspBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "ResourcesType")
    private String resourcesType;

    @RspField(tagName = "ResourcesCode")
    private String resourcesCode;

    @RspField(tagName = "RscStateCode")
    private String rscStateCode;

    @RspField(tagName = "RscStateDesc")
    private String rscStateDesc;

    @RspField(tagName = "NumID")
    private String numID;

    @RspField(tagName = "NumMemo")
    private String numMemo;

    @RspField(tagName = "NumPreFee")
    private String numPreFee;

    @RspField(tagName = "NumLevel")
    private String numLevel;

    @RspField(tagName = "NumProduct")
    private String numProduct;

    @RspField(tagName = "NumRelNum")
    private String numRelNum;

    public String getResourcesType() {
        return resourcesType;
    }

    public void setResourcesType(String resourcesType) {
        this.resourcesType = resourcesType;
    }

    public String getResourcesCode() {
        return resourcesCode;
    }

    public void setResourcesCode(String resourcesCode) {
        this.resourcesCode = resourcesCode;
    }

    public String getRscStateCode() {
        return rscStateCode;
    }

    public void setRscStateCode(String rscStateCode) {
        this.rscStateCode = rscStateCode;
    }

    public String getRscStateDesc() {
        return rscStateDesc;
    }

    public void setRscStateDesc(String rscStateDesc) {
        this.rscStateDesc = rscStateDesc;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String getNumMemo() {
        return numMemo;
    }

    public void setNumMemo(String numMemo) {
        this.numMemo = numMemo;
    }

    public String getNumPreFee() {
        return numPreFee;
    }

    public void setNumPreFee(String numPreFee) {
        this.numPreFee = numPreFee;
    }

    public String getNumLevel() {
        return numLevel;
    }

    public void setNumLevel(String numLevel) {
        this.numLevel = numLevel;
    }

    public String getNumProduct() {
        return numProduct;
    }

    public void setNumProduct(String numProduct) {
        this.numProduct = numProduct;
    }

    public String getNumRelNum() {
        return numRelNum;
    }

    public void setNumRelNum(String numRelNum) {
        this.numRelNum = numRelNum;
    }
}
