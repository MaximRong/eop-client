package org.phw.eop.api.bean.querysnuser.rsp;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class ActivityInfoBean implements Serializable {

    private static final long serialVersionUID = -6683588840719173355L;

    @RspField(tagName = "ACTIVITY_ID")
    private String activityId;

    @RspField(tagName = "ACTIVITY_NAME")
    private String activityName;

    @RspField(tagName = "ACTIVITY_ACTIVE_TIME")
    private String activityActiveTime;

    @RspField(tagName = "ACTIVITY_INACTIVE_TIME")
    private String activityInActiveTime;

    private String activityType;
    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityActiveTime() {
        return activityActiveTime;
    }

    public void setActivityActiveTime(String activityActiveTime) {
        this.activityActiveTime = activityActiveTime;
    }

    public String getActivityInActiveTime() {
        return activityInActiveTime;
    }

    public void setActivityInActiveTime(String activityInActiveTime) {
        this.activityInActiveTime = activityInActiveTime;
    }

    public String getActivityType() {
        return activityType;
    }
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }
}
