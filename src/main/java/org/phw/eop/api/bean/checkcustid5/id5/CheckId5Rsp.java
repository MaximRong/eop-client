package org.phw.eop.api.bean.checkcustid5.id5;

import org.phw.eop.api.bean.ebase.EBaseRsp;
import org.phw.eop.api.bean.ebase.EMessage;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class CheckId5Rsp extends EBaseRsp<CheckId5RspBody> {

    @Override
    public EMessage<CheckId5RspBody> getBody() {
        return getMessage();
    }

}
