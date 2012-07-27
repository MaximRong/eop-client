package org.phw.eop.api.bean.jccard;

import org.phw.eop.api.bean.base.BaseReq;
import org.phw.eop.api.bean.jccard.req.JcCardReqBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

/**
 * JAVA 卡平台调用请求报文bean.
 * @author maxim
 *
 */
@EopBean(propMapping = PropMappingFieldName.class)
public class JcCardReq extends BaseReq<JcCardRsp> {

    private JcCardReqBean reqBean;

    @Override
    public String getAction() {
        return "org.jccard";
    }

    @Override
    public String getApptx() {
        return "org.jccard";
    }

    @Override
    public Class<JcCardRsp> getRspClass() {
        return JcCardRsp.class;
    }

    public void setReqBean(JcCardReqBean reqBean) {
        this.reqBean = reqBean;
    }

    public JcCardReqBean getReqBean() {
        return reqBean;
    }

}
