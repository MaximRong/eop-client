package org.phw.eop.api.bean.jccard.req;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@EopBean(propMapping = PropMappingFieldName.class)
public class JcCardBean {

    // sessionID
    protected String sessionID;

    // 业务类型
    protected String businessType;

    // 是否是第一次请求
    private boolean isFirst;

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

    public void setIsFirst(boolean isFirst) {
        this.isFirst = isFirst;
    }

    public boolean getIsFirst() {
        return isFirst;
    }

}
