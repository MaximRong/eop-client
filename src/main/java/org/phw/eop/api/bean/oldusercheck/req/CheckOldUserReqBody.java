package org.phw.eop.api.bean.oldusercheck.req;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

@EopBean
public class CheckOldUserReqBody implements Serializable {
    private static final long serialVersionUID = 1L;

    private String bipCode;

    @ReqField(mappedOut = true)
    private OperBean oper;

    private String bipType;

    private String numID;

    private String sysCode;

    private List<ProductInfoBean> productInfo;

    private List<ActivityInfoBean> activityInfo;

    private List<ParaBean> para;

    public String getBipCode() {
        return bipCode;
    }

    public void setBipCode(String bipCode) {
        this.bipCode = bipCode;
    }

    public OperBean getOper() {
        return oper;
    }

    public void setOper(OperBean oper) {
        this.oper = oper;
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

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

}
