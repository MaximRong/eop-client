package org.phw.eop.api.bean.owecheck;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.owecheck.rsp.OweCheckResRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 自备终端入网校验RspBean。
 * 
 * 接口：自备终端入网校验。
 *
 * @author whx
 *
 * 2012-1-16
 */
@EopBean
public class OweCheckResRsp extends BaseRsp {

    private OweCheckResRspBody rspBody;

    public OweCheckResRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(OweCheckResRspBody rspBody) {
        this.rspBody = rspBody;
    }

    @Override
    public Object getBody() {
        return rspBody;
    }

}
