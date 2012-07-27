package org.phw.eop.api.bean.checkolduser.rsp;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.bean.checkolduser.req.ProductInfoBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 老用户业务校验接口 返回报文体
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
@EopBean
public class CheckRspBody {

    private static final long serialVersionUID = 1L;

    private String respCode;

    private String respDesc;

    private String renewal;

    private List<ProductInfoBean> productInfo;

    private List<ActivityInfoBean> activityInfo;

    private List<ParaBean> para;

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
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

    public String getRenewal() {
        return renewal;
    }

    public void setRenewal(String renewal) {
        this.renewal = renewal;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
