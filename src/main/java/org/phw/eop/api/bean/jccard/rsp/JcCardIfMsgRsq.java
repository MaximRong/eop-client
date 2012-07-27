package org.phw.eop.api.bean.jccard.rsp;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

/**
 * Java卡平台消息传回bean(IF2 ~ IF4 的返回信息都是用这个bean).
 * 
 * @author maxim
 *
 */
@EopBean(propMapping = PropMappingFieldName.class)
public class JcCardIfMsgRsq {

    private String rspDate;

    public void setRspDate(String rspDate) {
        this.rspDate = rspDate;
    }

    public String getRspDate() {
        return rspDate;
    }

}
