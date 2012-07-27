package org.phw.eop.api.bean.checkolduser.req;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 老用户业务校验接口请求报文体
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
@EopBean
public class CheckReqBody {

    @ReqField(mappedOut = true)
    private OperBean oper;

    private String bipType;

    private String numID;

    private String sysCode;

    private List<ProductInfoBean> productInfo;

    private List<ActivityInfoBean> activityInfo;

    private List<ParaBean> para;

    public OperBean getOper() {
        return oper;
    }

    public void setOper(OperBean oper) {
        this.oper = oper;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

    public String getBipType() {
        return bipType;
    }

    public void setBipType(String bipType) {
        this.bipType = bipType;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
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
