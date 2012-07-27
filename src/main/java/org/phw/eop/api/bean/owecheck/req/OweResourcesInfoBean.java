package org.phw.eop.api.bean.owecheck.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 资源信息Bean（请求）。
 *
 * @author whx
 *
 * 2012-1-16
 */
public class OweResourcesInfoBean {

    @ReqField(tagName = "ResourcesType")
    private String resourcesType;

    @ReqField(tagName = "ResourcesCode")
    private String resourcesCode;

    @ReqField(tagName = "ActivityTag")
    private String activityTag;

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

    public String getActivityTag() {
        return activityTag;
    }

    public void setActivityTag(String activityTag) {
        this.activityTag = activityTag;
    }

}
