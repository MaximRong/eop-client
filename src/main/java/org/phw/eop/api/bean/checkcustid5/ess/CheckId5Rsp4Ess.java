package org.phw.eop.api.bean.checkcustid5.ess;

import org.phw.eop.api.bean.ebase.EBaseRsp;
import org.phw.eop.api.bean.ebase.EMessage;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class CheckId5Rsp4Ess extends EBaseRsp<CheckId5RspBody4Ess> {

    @Override
    public EMessage<CheckId5RspBody4Ess> getBody() {
        return getMessage();
    }

}
