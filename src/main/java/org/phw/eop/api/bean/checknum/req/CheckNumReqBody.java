package org.phw.eop.api.bean.checknum.req;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 号码资源状态变更 接口请求报文体。
 *
 * @author xrx
 *
 */
@EopBean
public class CheckNumReqBody implements Serializable {

    private static final long serialVersionUID = 1L;

    @ReqField(mappedOut = true)
    private OperBean oper;

    private String sysCode;

    private List<ResourcesInfoBean> resourcesInfo;

    private List<ParaBean> para;

    public OperBean getOper() {
        return oper;
    }

    public void setOper(OperBean oper) {
        this.oper = oper;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public List<ResourcesInfoBean> getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(List<ResourcesInfoBean> resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

}
