package org.phw.eop.api.bean.checkolduser.rsp;

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

}
