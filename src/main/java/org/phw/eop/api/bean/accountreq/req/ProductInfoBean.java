package org.phw.eop.api.bean.accountreq.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class ProductInfoBean {

    @ReqField(tagName = "ProductID")
    private String productID;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

}
