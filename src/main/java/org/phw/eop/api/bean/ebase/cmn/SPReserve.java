package org.phw.eop.api.bean.ebase.cmn;

import org.n3r.core.beanverify.annotation.DefaultNotNull;
import org.n3r.core.xml.annotation.RXElement;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@DefaultNotNull
@EopBean(propMapping = PropMappingFieldName.class)
public class SPReserve {

    private String transIDC;
    private String cutOffDay;
    @RXElement("OSNDUNS")
    private String osnduns;
    @RXElement("HSNDUNS")
    private String hsnduns;
    private String convID;

    public String getTransIDC() {
        return transIDC;
    }

    public void setTransIDC(String transIDC) {
        this.transIDC = transIDC;
    }

    public String getCutOffDay() {
        return cutOffDay;
    }

    public void setCutOffDay(String cutOffDay) {
        this.cutOffDay = cutOffDay;
    }

    public String getOsnduns() {
        return osnduns;
    }

    public void setOsnduns(String osnduns) {
        this.osnduns = osnduns;
    }

    public String getHsnduns() {
        return hsnduns;
    }

    public void setHsnduns(String hsnduns) {
        this.hsnduns = hsnduns;
    }

    public String getConvID() {
        return convID;
    }

    public void setConvID(String convID) {
        this.convID = convID;
    }

}
