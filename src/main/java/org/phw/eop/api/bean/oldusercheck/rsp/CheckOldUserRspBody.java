package org.phw.eop.api.bean.oldusercheck.rsp;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.bean.oldusercheck.req.ActivityInfoBean;
import org.phw.eop.api.bean.oldusercheck.req.ProductInfoBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class CheckOldUserRspBody implements Serializable {
    private static final long serialVersionUID = 1L;

    private String respCode;

    private String respDesc;

    private List<ProductInfoBean> productInfo;

    private List<ActivityInfoBean> activityInfo;

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

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

}
