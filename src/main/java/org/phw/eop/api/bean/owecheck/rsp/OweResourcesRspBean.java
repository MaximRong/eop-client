package org.phw.eop.api.bean.owecheck.rsp;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 资源信息Bean（响应）。
 *
 * @author whx
 *
 * 2012-1-16
 */
public class OweResourcesRspBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "ResourcesType")
    private String resourcesType;

    @RspField(tagName = "ResourcesCode")
    private String resourcesCode;

    @RspField(tagName = "ResourcesBrandCode")
    private String resourcesBrandCode;

    @RspField(tagName = "ResourcesBrandName")
    private String resourcesBrandName;

    @RspField(tagName = "ResourcesModelCode")
    private String resourcesModelCode;

    @RspField(tagName = "ResourcesModelName")
    private String resourcesModelName;

    @RspField(tagName = "ResourcesSrcCode")
    private String resourcesSrcCode;

    @RspField(tagName = "ResourcesSrcName")
    private String resourcesSrcName;

    @RspField(tagName = "ResourcesSupplyCorp")
    private String resourcesSupplyCorp;

    @RspField(tagName = "ResourcesServiceCorp")
    private String resourcesServiceCorp;

    @RspField(tagName = "ResourcesColor")
    private String resourcesColor;

    @RspField(tagName = "MachineTypeCode")
    private String machineTypeCode;

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

    public String getResourcesBrandCode() {
        return resourcesBrandCode;
    }

    public void setResourcesBrandCode(String resourcesBrandCode) {
        this.resourcesBrandCode = resourcesBrandCode;
    }

    public String getResourcesBrandName() {
        return resourcesBrandName;
    }

    public void setResourcesBrandName(String resourcesBrandName) {
        this.resourcesBrandName = resourcesBrandName;
    }

    public String getResourcesModelCode() {
        return resourcesModelCode;
    }

    public void setResourcesModelCode(String resourcesModelCode) {
        this.resourcesModelCode = resourcesModelCode;
    }

    public String getResourcesModelName() {
        return resourcesModelName;
    }

    public void setResourcesModelName(String resourcesModelName) {
        this.resourcesModelName = resourcesModelName;
    }

    public String getResourcesSrcCode() {
        return resourcesSrcCode;
    }

    public void setResourcesSrcCode(String resourcesSrcCode) {
        this.resourcesSrcCode = resourcesSrcCode;
    }

    public String getResourcesSrcName() {
        return resourcesSrcName;
    }

    public void setResourcesSrcName(String resourcesSrcName) {
        this.resourcesSrcName = resourcesSrcName;
    }

    public String getResourcesSupplyCorp() {
        return resourcesSupplyCorp;
    }

    public void setResourcesSupplyCorp(String resourcesSupplyCorp) {
        this.resourcesSupplyCorp = resourcesSupplyCorp;
    }

    public String getResourcesServiceCorp() {
        return resourcesServiceCorp;
    }

    public void setResourcesServiceCorp(String resourcesServiceCorp) {
        this.resourcesServiceCorp = resourcesServiceCorp;
    }

    public String getResourcesColor() {
        return resourcesColor;
    }

    public void setResourcesColor(String resourcesColor) {
        this.resourcesColor = resourcesColor;
    }

    public String getMachineTypeCode() {
        return machineTypeCode;
    }

    public void setMachineTypeCode(String machineTypeCode) {
        this.machineTypeCode = machineTypeCode;
    }

}
