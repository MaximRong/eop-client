package org.phw.eop.api.bean.numqry;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.numqry.rsp.NumQryRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 号码查询接口
 *
 * @author zhaowj
 *
 * 2012-1-9
 */
@EopBean
public class NumQryRsp extends BaseRsp {

    private NumQryRspBody rspBody;

    public NumQryRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(NumQryRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public Object getBody() {
        return rspBody;
    }

}
