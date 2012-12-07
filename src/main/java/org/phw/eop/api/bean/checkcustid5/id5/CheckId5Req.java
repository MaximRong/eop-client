package org.phw.eop.api.bean.checkcustid5.id5;

import org.phw.eop.api.bean.ebase.EBaseReq;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class CheckId5Req extends EBaseReq<CheckId5Rsp, CheckId5ReqBody> {

    @Override
    public String getAction() {
        return "idservice.gzt.idcheck";
    }

    @Override
    public String getApptx() {
        return "idservice.gzt.idcheck";
    }

    @Override
    public Class<CheckId5Rsp> getRspClass() {
        return CheckId5Rsp.class;
    }

}
