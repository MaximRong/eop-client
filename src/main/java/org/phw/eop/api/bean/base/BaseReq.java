package org.phw.eop.api.bean.base;

import org.phw.eop.api.Req;
import org.phw.eop.api.Rsp;
import org.phw.eop.api.bean.base.head.ReqHeadBean;
import org.phw.eop.api.internal.mapping.ReqMappings;
import org.phw.eop.api.internal.mapping.SecuretType;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.util.EopMap;

/**
 * 请求数据封装基类。
 *
 * @author wanglei
 *
 * 2012-1-10
 */
@EopBean
public abstract class BaseReq<T extends Rsp> implements Req<T> {

    private String province;

    private ReqHeadBean reqHead;

    private String headRoot = "UniBSS";

    @Override
    public boolean isMock() {
        return false;
    }

    @Override
    public EopMap getParams() {
        return ReqMappings.getParams(this, SecuretType.NONE);
    }

    @Override
    public EopMap getSecuretValueParams() {
        return ReqMappings.getParams(this, SecuretType.VALUE);
    }

    @Override
    public EopMap getSecuretKeyValueParams() {
        return ReqMappings.getParams(this, SecuretType.KEYVALUE);
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public ReqHeadBean getReqHead() {
        return reqHead;
    }

    public void setReqHead(ReqHeadBean reqHead) {
        this.reqHead = reqHead;
    }

    public String getHeadRoot() {
        return headRoot;
    }

    public void setHeadRoot(String headRoot) {
        this.headRoot = headRoot;
    }
}
