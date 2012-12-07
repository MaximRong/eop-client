package org.phw.eop.api.bean.checkcustid5.id5;

import java.util.List;

import org.n3r.core.beanverify.annotation.DefaultNotNull;
import org.n3r.core.beanverify.annotation.NotNull;
import org.n3r.core.beanverify.enumeration.NotNullWhen;
import org.n3r.core.xml.annotation.RXRootElement;
import org.phw.eop.api.bean.ebase.cmn.Para;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@DefaultNotNull
@EopBean(propMapping = PropMappingFieldName.class)
@RXRootElement("CheckCustReq")
public class CheckId5ReqBody {

    private String provinceCode;
    private String cityCode;
    private String name;
    private String id;
    @NotNull(NotNullWhen.None)
    private List<Para> paras;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Para> getParas() {
        return paras;
    }

    public void setParas(List<Para> paras) {
        this.paras = paras;
    }

}
