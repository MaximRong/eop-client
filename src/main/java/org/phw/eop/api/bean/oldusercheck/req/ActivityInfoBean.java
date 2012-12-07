package org.phw.eop.api.bean.oldusercheck.req;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class ActivityInfoBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String actPlanID;

    private String actProtPer;

    private String resourcesModel;

    private String resourcesBrand;

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

    public String getResourcesBrand() {
        return resourcesBrand;
    }

    public void setResourcesBrand(String resourcesBrand) {
        this.resourcesBrand = resourcesBrand;
    }

    public List<ActParaBean> getActPara() {
        return actPara;
    }

    public void setActPara(List<ActParaBean> actPara) {
        this.actPara = actPara;
    }

}
