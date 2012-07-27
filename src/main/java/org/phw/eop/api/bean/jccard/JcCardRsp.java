package org.phw.eop.api.bean.jccard;

import org.phw.eop.api.bean.base.BaseRsp;
import org.phw.eop.api.bean.jccard.rsp.JcCardCobRsq;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

/**
 * JAVA 卡平台返回报文;.
 *  @author maxim
 *
 */
@EopBean(propMapping = PropMappingFieldName.class)
public class JcCardRsp extends BaseRsp {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private JcCardCobRsq jcCardCobRsq;

    @Override
    public Object getBody() {
        return null;
    }

    public void setJcCardCobRsq(JcCardCobRsq jcCardCobRsq) {
        this.jcCardCobRsq = jcCardCobRsq;
    }

    public JcCardCobRsq getJcCardCobRsq() {
        return jcCardCobRsq;
    }

}
