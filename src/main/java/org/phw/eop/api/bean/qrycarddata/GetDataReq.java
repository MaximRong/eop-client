package org.phw.eop.api.bean.qrycarddata;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.qrycarddata.req.GetDataReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 写卡数据查询接口 请求报文
 * @author lita
 *
 */
@EopBean
public class GetDataReq extends BaseReq<GetDataRsp> {

    private GetDataReqBody reqBody;

    private String bodyRoot = "GetDataReq";

    @Override
    public String getAction() {
        return "ess.qrycarddata";
    }

    @Override
    public String getApptx() {
        return "ess.qrycarddata";
    }

    @Override
    public Class<GetDataRsp> getRspClass() {
        return GetDataRsp.class;
    }

    public GetDataReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(GetDataReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

    public void setBodyRoot(String bodyRoot) {
        this.bodyRoot = bodyRoot;
    }

}
