package org.phw.eop.api.bean.checkolduser;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.checkolduser.rsp.CheckRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 老用户业务校验接口RspBean。
 * 
 * @author wanglei
 *
 * 2012-1-9
 */
@EopBean
public class CheckReqRsp extends BaseRsp {

    private CheckRspBody rspBody;

    public CheckRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(CheckRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public Object getBody() {
        return rspBody;
    }

}
