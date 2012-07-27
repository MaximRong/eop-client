package org.phw.eop.api.bean.base;

import org.phw.eop.api.Rsp;
import org.phw.eop.api.bean.base.head.RspHeadBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 响应数据封装基类。
 *
 * @author wanglei
 *
 * 2012-1-10
 */
@EopBean
public abstract class BaseRsp extends Rsp {

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
