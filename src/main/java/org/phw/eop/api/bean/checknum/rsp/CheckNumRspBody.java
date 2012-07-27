package org.phw.eop.api.bean.checknum.rsp;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 号码资源状态变更接口报文.
 * @author xrx
 */
@EopBean
public class CheckNumRspBody implements Serializable {

    private static final long serialVersionUID = 1L;

    private String respCode;

    private List<ResourcesNumRspBean> resourcesRsp;

    private List<ParaBean> para;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public List<ResourcesNumRspBean> getResourcesRsp() {
        return resourcesRsp;
    }

    public void setResourcesRsp(List<ResourcesNumRspBean> resourcesRsp) {
        this.resourcesRsp = resourcesRsp;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

}
