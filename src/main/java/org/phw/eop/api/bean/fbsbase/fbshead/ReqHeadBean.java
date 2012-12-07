package org.phw.eop.api.bean.fbsbase.fbshead;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 全业务请求头Bean
 * 
 * 继承自ess请求头
 * 
 * @author Lurker
 * 
 */
@EopBean
public class ReqHeadBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @ReqField(tagName = "ORIG_DOMAIN")
    private String origDomain;

    @ReqField(tagName = "SERVICE_NAME")
    private String serviceName;

    @ReqField(tagName = "OPERATE_NAME")
    private String operateName;

    @ReqField(tagName = "ACTION_CODE")
    private String actionCode;

    @ReqField(tagName = "ACTION_RELATION")
    private String actionRelation;

    @ReqField(tagName = "ROUTING")
    private RoutingBean Routing;

    @ReqField(tagName = "PROC_ID")
    private String procId;

    @ReqField(tagName = "TRANS_IDO")
    private String transIDO;

    @ReqField(tagName = "TRANS_IDH")
    private String transIDH;

    @ReqField(tagName = "PROCESS_TIME")
    private String processTime;

    @ReqField(tagName = "COM_BUS_INFO")
    private ComBusInfoBean comBusInfo;

    @ReqField(tagName = "SP_RESERVE")
    private SPReserveBean sPReserve;

    @ReqField(tagName = "TEST_FLAG")
    private String testFlag;

    @ReqField(tagName = "MSG_SENDER")
    private String msgSender;

    @ReqField(tagName = "MSG_RECEIVER")
    private String msgReceiver;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    public String getActionRelation() {
        return actionRelation;
    }

    public void setActionRelation(String actionRelation) {
        this.actionRelation = actionRelation;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getTransIDH() {
        return transIDH;
    }

    public void setTransIDH(String transIDH) {
        this.transIDH = transIDH;
    }

    public ComBusInfoBean getComBusInfo() {
        return comBusInfo;
    }

    public void setComBusInfo(ComBusInfoBean comBusInfo) {
        this.comBusInfo = comBusInfo;
    }

    public SPReserveBean getsPReserve() {
        return sPReserve;
    }

    public void setsPReserve(SPReserveBean sPReserve) {
        this.sPReserve = sPReserve;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public RoutingBean getRouting() {
        return Routing;
    }

    public void setRouting(RoutingBean routing) {
        Routing = routing;
    }

    public String getOrigDomain() {
        return origDomain;
    }

    public void setOrigDomain(String origDomain) {
        this.origDomain = origDomain;
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

}