package org.phw.eop.api.bean.jccard.rsp;

import org.phw.eop.api.bean.jccard.req.JcCardBean;

/**
 * JAVA 卡平台接口返回bean.
 * @author maxim
 *
 */
public class JcCardRsqBean extends JcCardBean {

    private boolean isSuccess;

    private String rsqData;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getRsqData() {
        return rsqData;
    }

    public void setRsqData(String rsqData) {
        this.rsqData = rsqData;
    }

}
