package org.phw.eop.api.bean.fbsbase;

import org.phw.eop.api.Req;
import org.phw.eop.api.Rsp;
import org.phw.eop.api.bean.fbsbase.fbshead.ReqHeadBean;
import org.phw.eop.api.internal.mapping.ReqMappings;
import org.phw.eop.api.internal.mapping.SecuretType;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.util.EopMap;

/**
 * 全业务请求bean
 * 
 * @author Lurker
 * @param <T>
 */
@EopBean
public abstract class FbsBaseReq<T extends Rsp> implements Req<T> {
    private String province;

    private ReqHeadBean reqHead;

    private String headRoot = "UNI_BSS_HEAD";

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
