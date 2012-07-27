package org.phw.eop.api.bean.checkstaff;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.checkstaff.rsp.CheckStaffRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 员工校验接口RspBean
 * @author Lurker
 *
 */
@EopBean
public class CheckStaffRsp extends BaseRsp{

    private CheckStaffRspBody rspBody;
    
    public CheckStaffRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(CheckStaffRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public Object getBody() {
        return rspBody;
    }

}
