package org.phw.eop.api.bean.checkolduser.req;

import java.util.List;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 新活动信息bean
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
@EopBean
public class ActivityInfoBean {

    private String actPlanID;

    private String actProtPer;

    private String resourcesModel;

    private List<ActParaBean> actPara;

    public String getActPlanID() {
        return actPlanID;
    }

    public void setActPlanID(String actPlanID) {
        this.actPlanID = actPlanID;
    }

    public String getActProtPer() {
        return actProtPer;
    }

    public void setActProtPer(String actProtPer) {
        this.actProtPer = actProtPer;
    }

    public String getResourcesModel() {
        return resourcesModel;
    }

    public void setResourcesModel(String resourcesModel) {
        this.resourcesModel = resourcesModel;
    }

    public List<ActParaBean> getActPara() {
        return actPara;
    }

    public void setActPara(List<ActParaBean> actPara) {
        this.actPara = actPara;
    }

}
