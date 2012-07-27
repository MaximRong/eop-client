package org.phw.eop.api.bean.owecheck.req;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 自备终端入网校验接口请求报文体。
 *
 * @author whx
 *
 * 2012-1-10
 */
public class OweCheckResReqBody implements Serializable {

    private static final long serialVersionUID = 1L;

    @ReqField(mappedOut = true)
    private OperBean oper;

    @ReqField(tagName = "ResourcesInfo")
    private List<OweResourcesInfoBean> resourcesInfo;

    @ReqField(tagName = "Para")
    private List<ParaBean> para;

    public OperBean getOper() {
        return oper;
    }

    public void setOper(OperBean oper) {
        this.oper = oper;
    }

    public List<OweResourcesInfoBean> getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(List<OweResourcesInfoBean> resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

}
