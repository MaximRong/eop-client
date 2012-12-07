package org.phw.eop.api.bean.jccard.req;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@EopBean(propMapping = PropMappingFieldName.class)
public class JcCardBean {

    // sessionID
    protected String sessionID;

    // 业务类型
    protected String businessType;

    // 是否返回消息
    private boolean isBackMsg;

    // 卡操作会话的初始请求
    //    private boolean firstCardSession;

    // 是否有返回消息
    private boolean hasBack;

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setHasBack(boolean hasBack) {
        this.hasBack = hasBack;
    }

    public boolean isHasBack() {
        return hasBack;
    }

    public void setIsBackMsg(boolean isBackMsg) {
        this.isBackMsg = isBackMsg;
    }

    public boolean getIsBackMsg() {
        return isBackMsg;
    }

    //    public void setFirstCardSession(boolean firstCardSession) {
    //        this.firstCardSession = firstCardSession;
    //    }
    //
    //    public boolean isFirstCardSession() {
    //        return firstCardSession;
    //    }

}
