package org.phw.eop.api.bean.checkres.req;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 销售资源状态变更接口请求报文体。
 *
 * @author wanglei
 *
 * 2012-1-10
 */
@EopBean
public class CheckResReqBody implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sysCode;

    @ReqField(mappedOut = true)
    private OperBean oper;

    @ReqField(tagName = "ResourcesInfo")
    private List<ResourcesInfoBean> resourcesInfo;

    @ReqField(tagName = "Para")
    private List<ParaBean> para;

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public OperBean getOper() {
        return oper;
    }

    public void setOper(OperBean oper) {
        this.oper = oper;
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
