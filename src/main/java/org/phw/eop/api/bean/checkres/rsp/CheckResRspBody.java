package org.phw.eop.api.bean.checkres.rsp;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 销售资源状态变更接口响应报文体。
 *
 * @author wanglei
 *
 * 2012-1-10
 */
public class CheckResRspBody implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "RespCode")
    private String respCode;

    @RspField(tagName = "ResourcesRsp")
    private List<ResourcesRspBean> resourcesRsp;

    @RspField(tagName = "Para")
    private List<ParaBean> para;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public List<ResourcesRspBean> getResourcesRsp() {
        return resourcesRsp;
    }

    public void setResourcesRsp(List<ResourcesRspBean> resourcesRsp) {
        this.resourcesRsp = resourcesRsp;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

}
