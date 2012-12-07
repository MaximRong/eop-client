package org.phw.eop.api.bean.querysnuser.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class ProductInfoBean {

    @RspField(tagName = "PRODUCT_ID")
    private String productId;
    
    @RspField(tagName = "PRODUCT_NAME")
    private String productName;
    
    @RspField(tagName = "PRODUCT_ACTIVE_TIME")
    private String productActiveTime;
    
    @RspField(tagName = "PRODUCT_INACTIVE_TIME")
    private String productInactiveTime;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductActiveTime() {
        return productActiveTime;
    }

    public void setProductActiveTime(String productActiveTime) {
        this.productActiveTime = productActiveTime;
    }

    public String getProductInactiveTime() {
        return productInactiveTime;
    }

    public void setProductInactiveTime(String productInactiveTime) {
        this.productInactiveTime = productInactiveTime;
    }
}
