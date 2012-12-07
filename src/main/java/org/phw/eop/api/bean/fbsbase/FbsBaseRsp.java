package org.phw.eop.api.bean.fbsbase;

import org.phw.eop.api.Rsp;
import org.phw.eop.api.bean.fbsbase.fbshead.RspHeadBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 全业务返回bean
 * @author Lurker
 */
@EopBean
public abstract class FbsBaseRsp extends Rsp {
    private RspHeadBean rspHead;

    private String rspXml;

    public RspHeadBean getRspHead() {
        return rspHead;
    }

    public void setRspHead(RspHeadBean rspHead) {
        this.rspHead = rspHead;
    }

    public String getRspXml() {
        return rspXml;
    }

    public void setRspXml(String rspXml) {
        this.rspXml = rspXml;
    }

    public abstract Object getBody();
}
