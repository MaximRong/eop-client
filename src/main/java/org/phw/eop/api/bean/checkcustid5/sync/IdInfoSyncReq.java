package org.phw.eop.api.bean.checkcustid5.sync;

import org.phw.eop.api.bean.ebase.EBaseReq;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class IdInfoSyncReq extends EBaseReq<IdInfoSyncRsp, IdInfoSyncReqBody> {

    @Override
    public String getAction() {
        return "idservice.ess.idinfosync";
    }

    @Override
    public String getApptx() {
        return "idservice.ess.idinfosync";
    }

    @Override
    public Class<IdInfoSyncRsp> getRspClass() {
        return IdInfoSyncRsp.class;
    }

}
