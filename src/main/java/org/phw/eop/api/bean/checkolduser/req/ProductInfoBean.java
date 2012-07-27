package org.phw.eop.api.bean.checkolduser.req;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 开户时选择的产品信息bean
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
@EopBean
public class ProductInfoBean {

    private String productID;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

}
