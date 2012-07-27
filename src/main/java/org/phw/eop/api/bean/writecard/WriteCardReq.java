package org.phw.eop.api.bean.writecard;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.writecard.req.WriteCardReqBody;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 写卡结果通知接口 请求报文
 * @author lita
 *
 */
@EopBean
public class WriteCardReq extends BaseReq<WriteCardRsp> {

    private WriteCardReqBody reqBody;

    private String bodyRoot = "WriteCardReq";

    @Override
    public String getAction() {
        return "ess.writecard";
    }

    @Override
    public String getApptx() {
        return "ess.writecard";
    }

    @Override
    public Class<WriteCardRsp> getRspClass() {
        return WriteCardRsp.class;
    }

    public WriteCardReqBody getReqBody() {
        return reqBody;
    }

    public void setReqBody(WriteCardReqBody reqBody) {
        this.reqBody = reqBody;
    }

    public String getBodyRoot() {
        return bodyRoot;
    }

    public void setBodyRoot(String bodyRoot) {
        this.bodyRoot = bodyRoot;
    }

}
