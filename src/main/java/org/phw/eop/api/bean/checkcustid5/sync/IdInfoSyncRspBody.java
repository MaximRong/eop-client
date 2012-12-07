package org.phw.eop.api.bean.checkcustid5.sync;

import java.util.List;

import org.n3r.core.beanverify.annotation.NotNull;
import org.n3r.core.xml.annotation.RXRootElement;
import org.phw.eop.api.bean.ebase.cmn.Para;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@EopBean(propMapping = PropMappingFieldName.class)
@RXRootElement("SynDataRsp")
public class IdInfoSyncRspBody {

    @NotNull
    private String respCode;
    @NotNull
    private String respDesc;
    private List<Para> paras;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public List<Para> getParas() {
        return paras;
    }

    public void setParas(List<Para> paras) {
        this.paras = paras;
    }

}
