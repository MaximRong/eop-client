package org.phw.eop.api.bean.account.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class ProductInfoBean {

    @ReqField(tagName = "ProductID")
    private String productID;
    @ReqField(tagName = "ProductMode")
    private String productMode;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductMode() {
        return productMode;
    }

    public void setProductMode(String productMode) {
        this.productMode = productMode;
    }

}
