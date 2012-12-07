package org.phw.eop.api.bean.ebase;

import org.phw.eop.api.Rsp;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public abstract class EBaseRsp<K> extends Rsp {

    private EMessage<K> message;

    public abstract EMessage<K> getBody();

    public void setMessage(EMessage<K> message) {
        this.message = message;
    }

    public EMessage<K> getMessage() {
        return message;
    }

}
