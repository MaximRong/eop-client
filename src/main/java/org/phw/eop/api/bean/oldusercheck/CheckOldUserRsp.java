package org.phw.eop.api.bean.oldusercheck;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.oldusercheck.rsp.CheckOldUserRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class CheckOldUserRsp extends BaseRsp {

    private CheckOldUserRspBody rspBody;

    public CheckOldUserRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(CheckOldUserRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public Object getBody() {
        return rspBody;
    }

}
