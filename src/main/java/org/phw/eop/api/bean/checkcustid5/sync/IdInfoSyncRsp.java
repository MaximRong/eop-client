package org.phw.eop.api.bean.checkcustid5.sync;

import org.phw.eop.api.bean.ebase.EBaseRsp;
import org.phw.eop.api.bean.ebase.EMessage;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class IdInfoSyncRsp extends EBaseRsp<IdInfoSyncRspBody> {

    @Override
    public EMessage<IdInfoSyncRspBody> getBody() {
        return getMessage();
    }

}
