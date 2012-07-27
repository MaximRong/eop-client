package org.phw.eop.api.bean.accountreq.req;

import java.util.List;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class ActivityInfoBean {

    @ReqField(tagName = "ActPlanID")
    private String actPlanID;

    @ReqField(tagName = "ResourcesType")
    private String resourcesType;

    @ReqField(tagName = "ResProcId")
    private String resProcId;

    @ReqField(tagName = "ResourcesCode")
    private String resourcesCode;

    @ReqField(tagName = "ResourcesFee")
    private String resourcesFee;

    @ReqField(tagName = "ActPara")
    private List<ActParaBean> actPara;

    public String getActPlanID() {
        return actPlanID;
    }

    public void setActPlanID(String actPlanID) {
        this.actPlanID = actPlanID;
    }

    public String getResourcesType() {
        return resourcesType;
    }

    public void setResourcesType(String resourcesType) {
        this.resourcesType = resourcesType;
    }

    public String getResProcId() {
        return resProcId;
    }

    public void setResProcId(String resProcId) {
        this.resProcId = resProcId;
    }

    public String getResourcesCode() {
        return resourcesCode;
    }

    public void setResourcesCode(String resourcesCode) {
        this.resourcesCode = resourcesCode;
    }

    public String getResourcesFee() {
        return resourcesFee;
    }

    public void setResourcesFee(String resourcesFee) {
        this.resourcesFee = resourcesFee;
    }

    public List<ActParaBean> getActPara() {
        return actPara;
    }

    public void setActPara(List<ActParaBean> actPara) {
        this.actPara = actPara;
    }

}
