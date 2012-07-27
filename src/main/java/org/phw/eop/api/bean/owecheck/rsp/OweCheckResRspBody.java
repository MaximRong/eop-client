package org.phw.eop.api.bean.owecheck.rsp;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 自备终端入网校验接口响应报文体。
 *
 * @author whx
 *
 * 2012-1-10
 */
public class OweCheckResRspBody implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "RespCode")
    private String respCode;

    @RspField(tagName = "ResourcesInfo")
    private List<OweResourcesRspBean> resourcesInfo;

    @RspField(tagName = "Para")
    private List<ParaBean> para;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public List<OweResourcesRspBean> getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(List<OweResourcesRspBean> resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

}
