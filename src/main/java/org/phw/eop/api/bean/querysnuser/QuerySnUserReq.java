package org.phw.eop.api.bean.querysnuser;

import org.phw.eop.api.bean.fbsbase.FbsBaseReq;
import org.phw.eop.api.bean.querysnuser.req.QuerySnUserReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 老用户资料查询ReqBean
 * 
 * @author Lurker
 * 
 */
@EopBean
public class QuerySnUserReq extends FbsBaseReq<QuerySnUserRsp> {

    private QuerySnUserReqBody reqBody;

    private String bodyRoot = "CHECK_USER_INFO_REQ";

    @Override
    public String getAction() {
        return "ess.querysnuser";
    }

    @Override
    public String getApptx() {
        return "ess.querysnuser";
    }

    @Override
    public Class<QuerySnUserRsp> getRspClass() {
        return QuerySnUserRsp.class;
    }

    public QuerySnUserReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(QuerySnUserReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

    public void setBodyRoot(String bodyRoot) {
        this.bodyRoot = bodyRoot;
    }

}
