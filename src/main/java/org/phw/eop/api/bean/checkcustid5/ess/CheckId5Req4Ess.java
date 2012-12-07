package org.phw.eop.api.bean.checkcustid5.ess;

import org.phw.eop.api.bean.ebase.EBaseReq;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class CheckId5Req4Ess extends EBaseReq<CheckId5Rsp4Ess, CheckId5ReqBody4Ess> {

    @Override
    public String getAction() {
        return "idservice.ess.idcheck";
    }

    @Override
    public String getApptx() {
        return "idservice.ess.idcheck";
    }

    @Override
    public Class<CheckId5Rsp4Ess> getRspClass() {
        return CheckId5Rsp4Ess.class;
    }

}
