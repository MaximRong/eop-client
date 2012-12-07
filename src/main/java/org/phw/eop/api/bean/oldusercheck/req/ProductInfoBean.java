package org.phw.eop.api.bean.oldusercheck.req;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;
import org.phw.eop.api.internal.mapping.annotation.RspField;

@EopBean
public class ProductInfoBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String oldProductID;

    private String oldNetCode;

    private String oldPrePayTag;

    @ReqField(tagName = "ProductID")
    @RspField(tagName = "ProductID")
    private String productId;

    private String netCode;

    private String prePayTag;

    public String getOldProductID() {
        return oldProductID;
    }

    public void setOldProductID(String oldProductID) {
        this.oldProductID = oldProductID;
    }

    public String getOldNetCode() {
        return oldNetCode;
    }

    public void setOldNetCode(String oldNetCode) {
        this.oldNetCode = oldNetCode;
    }

    public String getOldPrePayTag() {
        return oldPrePayTag;
    }

    public void setOldPrePayTag(String oldPrePayTag) {
        this.oldPrePayTag = oldPrePayTag;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getNetCode() {
        return netCode;
    }

    public void setNetCode(String netCode) {
        this.netCode = netCode;
    }

    public String getPrePayTag() {
        return prePayTag;
    }

    public void setPrePayTag(String prePayTag) {
        this.prePayTag = prePayTag;
    }

}
