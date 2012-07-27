package org.phw.eop.api.bean.base.head;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 请求报文头Bean。
 *
 * @author wanglei
 *
 * 2012-1-10
 */
@EopBean
public class ReqHeadBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String origDomain;

    private String homeDomain;

    private String bIPVer;

    private String activityCode;

    private String actionCode;

    private RoutingBean routing;

    private String transIDO;

    private String processTime;

    private String testFlag;

    private String msgSender;

    private String msgReceiver;

    private String svcContVer;

    @ReqField(tagName = "SvcCont", emptyMapped = true)
    private String svcCont;

    private String testIp;

    public String getOrigDomain() {
        return origDomain;
    }

    public void setOrigDomain(String origDomain) {
        this.origDomain = origDomain;
    }

    public String getHomeDomain() {
        return homeDomain;
    }

    public void setHomeDomain(String homeDomain) {
        this.homeDomain = homeDomain;
    }

    public String getbIPVer() {
        return bIPVer;
    }

    public void setbIPVer(String bIPVer) {
        this.bIPVer = bIPVer;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public RoutingBean getRouting() {
        return routing;
    }

    public void setRouting(RoutingBean routing) {
        this.routing = routing;
    }

    public String getTransIDO() {
        return transIDO;
    }

    public void setTransIDO(String transIDO) {
        this.transIDO = transIDO;
    }

    public String getProcessTime() {
        return processTime;
    }

    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }

    public String getTestFlag() {
        return testFlag;
    }

    public void setTestFlag(String testFlag) {
        this.testFlag = testFlag;
    }

    public String getMsgSender() {
        return msgSender;
    }

    public void setMsgSender(String msgSender) {
        this.msgSender = msgSender;
    }

    public String getMsgReceiver() {
        return msgReceiver;
    }

    public void setMsgReceiver(String msgReceiver) {
        this.msgReceiver = msgReceiver;
    }

    public String getSvcContVer() {
        return svcContVer;
    }

    public void setSvcContVer(String svcContVer) {
        this.svcContVer = svcContVer;
    }

    public String getSvcCont() {
        return svcCont;
    }

    public void setSvcCont(String svcCont) {
        this.svcCont = svcCont;
    }

    public String getTestIp() {
        return testIp;
    }

    public void setTestIp(String testIp) {
        this.testIp = testIp;
    }

}
