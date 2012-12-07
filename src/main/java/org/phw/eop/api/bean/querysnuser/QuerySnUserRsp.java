package org.phw.eop.api.bean.querysnuser;

import org.phw.eop.api.bean.fbsbase.FbsBaseRsp;
import org.phw.eop.api.bean.querysnuser.rsp.QuerySnUserRspBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 老用户资料查询RspBean
 * 
 * @author Lurker
 * 
 */
@EopBean
public class QuerySnUserRsp extends FbsBaseRsp {

    private QuerySnUserRspBody rspBody;

    @Override
    public Object getBody() {
        return rspBody;
    }

    public QuerySnUserRspBody getRspBody() {
        return rspBody;
    }

    public void setRspBody(QuerySnUserRspBody rspBody) {
        this.rspBody = rspBody;
    }

}
