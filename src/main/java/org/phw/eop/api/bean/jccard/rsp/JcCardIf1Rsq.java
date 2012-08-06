package org.phw.eop.api.bean.jccard.rsp;

import java.util.List;

import org.phw.eop.api.bean.jccard.req.JcCardBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@EopBean(propMapping = PropMappingFieldName.class)
public class JcCardIf1Rsq extends JcCardBean {

    private String result;

    private String cardProductName;

    private String userFlag;

    private String appNum;

    private List<JcAppBean> beanLst;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCardProductName() {
        return cardProductName;
    }

    public void setCardProductName(String cardProductName) {
        this.cardProductName = cardProductName;
    }

    public String getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag;
    }

    public String getAppNum() {
        return appNum;
    }

    public void setAppNum(String appNum) {
        this.appNum = appNum;
    }

    public List<JcAppBean> getBeanLst() {
        return beanLst;
    }

    public void setBeanLst(List<JcAppBean> beanLst) {
        this.beanLst = beanLst;
    }

}
