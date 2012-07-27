package org.phw.eop.api.bean.checkres;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.checkres.rsp.CheckResRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 销售资源状态变更RspBean。
 * 
 * 接口：销售资源状态变更。
 *
 * @author wanglei
 *
 * 2012-1-9
 */
@EopBean
public class CheckResRsp extends BaseRsp {

    private CheckResRspBody rspBody;

    public CheckResRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(CheckResRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public Object getBody() {
        return rspBody;
    }

}
