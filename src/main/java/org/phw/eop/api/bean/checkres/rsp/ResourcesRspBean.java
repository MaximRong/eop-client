package org.phw.eop.api.bean.checkres.rsp;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 资源信息Bean（响应）。
 *
 * @author wanglei
 *
 * 2012-1-9
 */
public class ResourcesRspBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "ResourcesType")
    private String resourcesType;

    @RspField(tagName = "ResourcesCode")
    private String resourcesCode;

    @RspField(tagName = "RscStateCode")
    private String rscStateCode;

    @RspField(tagName = "RscStateDesc")
    private String rscStateDesc;

    public String getResourcesType() {
        return resourcesType;
    }

    public void setResourcesType(String resourcesType) {
        this.resourcesType = resourcesType;
    }

    public String getResourcesCode() {
        return resourcesCode;
    }

    public void setResourcesCode(String resourcesCode) {
        this.resourcesCode = resourcesCode;
    }

    public String getRscStateCode() {
        return rscStateCode;
    }

    public void setRscStateCode(String rscStateCode) {
        this.rscStateCode = rscStateCode;
    }

    public String getRscStateDesc() {
        return rscStateDesc;
    }

    public void setRscStateDesc(String rscStateDesc) {
        this.rscStateDesc = rscStateDesc;
    }
}
