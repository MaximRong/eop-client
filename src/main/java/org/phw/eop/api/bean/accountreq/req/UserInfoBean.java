package org.phw.eop.api.bean.accountreq.req;

import java.util.List;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class UserInfoBean {

    @ReqField(tagName = "SerType")
    private String serType;

    @ReqField(tagName = "FirstMonBillMode")
    private String firstMonBillMode;

    @ReqField(tagName = "CreditVale")
    private String creditVale;

    @ReqField(tagName = "CheckCreditVale")
    private String checkCreditVale;

    @ReqField(tagName = "ProductInfo")
    private List<ProductInfoBean> productInfo;

    @ReqField(tagName = "ActivityInfo")
    private List<ActivityInfoBean> activityInfo;

    public String getSerType() {
        return serType;
    }

    public void setSerType(String serType) {
        this.serType = serType;
    }

    public String getFirstMonBillMode() {
        return firstMonBillMode;
    }

    public void setFirstMonBillMode(String firstMonBillMode) {
        this.firstMonBillMode = firstMonBillMode;
    }

    public String getCreditVale() {
        return creditVale;
    }

    public void setCreditVale(String creditVale) {
        this.creditVale = creditVale;
    }

    public String getCheckCreditVale() {
        return checkCreditVale;
    }

    public void setCheckCreditVale(String checkCreditVale) {
        this.checkCreditVale = checkCreditVale;
    }

    public List<ProductInfoBean> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(List<ProductInfoBean> productInfo) {
        this.productInfo = productInfo;
    }

    public List<ActivityInfoBean> getActivityInfo() {
        return activityInfo;
    }

    public void setActivityInfo(List<ActivityInfoBean> activityInfo) {
        this.activityInfo = activityInfo;
    }

}
