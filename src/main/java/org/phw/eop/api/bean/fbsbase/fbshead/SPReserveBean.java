package org.phw.eop.api.bean.fbsbase.fbshead;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;
import org.phw.eop.api.internal.mapping.annotation.RspField;

@EopBean
public class SPReserveBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @ReqField(tagName = "TRANS_IDC")
    @RspField(tagName = "TRANS_IDC")
    private String transIDC;

    @ReqField(tagName = "CUTOFFDAY")
    @RspField(tagName = "CUTOFFDAY")
    private String cutoffday;

    @ReqField(tagName = "OSNDUNS")
    @RspField(tagName = "OSNDUNS")
    private String osnduns;

    @ReqField(tagName = "HSNDUNS")
    @RspField(tagName = "HSNDUNS")
    private String hsnduns;

    @ReqField(tagName = "CONV_ID")
    @RspField(tagName = "CONV_ID")
    private String convId;

    public String getTransIDC() {
        return transIDC;
    }

    public void setTransIDC(String transIDC) {
        this.transIDC = transIDC;
    }

    public String getCutoffday() {
        return cutoffday;
    }

    public void setCutoffday(String cutoffday) {
        this.cutoffday = cutoffday;
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

    public String getConvId() {
        return convId;
    }

    public void setConvId(String convId) {
        this.convId = convId;
    }

}
