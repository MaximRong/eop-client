package org.phw.eop.api.bean.ebase;

import org.phw.eop.api.Req;
import org.phw.eop.api.Rsp;
import org.phw.eop.api.internal.mapping.ReqMappings;
import org.phw.eop.api.internal.mapping.SecuretType;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.util.EopMap;

@EopBean
public abstract class EBaseReq<T extends Rsp, K> implements Req<T> {

    private EMessage<K> message;

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

    public void setMessage(EMessage<K> message) {
        this.message = message;
    }

    public EMessage<K> getMessage() {
        return message;
    }

}
