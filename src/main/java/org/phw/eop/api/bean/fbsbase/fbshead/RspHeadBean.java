package org.phw.eop.api.bean.fbsbase.fbshead;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 全业务响应头Bean。
 * 
 * @author Lurker
 * 
 */
@EopBean
public class RspHeadBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "ORIG_DOMAIN")
    private String origDomain;

    @RspField(tagName = "SERVICE_NAME")
    private String serviceName;

    @RspField(tagName = "OPERATE_NAME")
    private String operateName;

    @RspField(tagName = "ACTION_CODE")
    private String actionCode;

    @RspField(tagName = "ACTION_RELATION")
    private String actionRelation;

    @RspField(tagName = "ROUTING")
    private RoutingBean routing;

    @RspField(tagName = "PROC_ID")
    private String procId;

    @RspField(tagName = "TRANS_IDO")
    private String transIDO;

    @RspField(tagName = "TRANS_IDH")
    private String transIDH;

    @RspField(tagName = "PROCESS_TIME")
    private String processTime;

    @RspField(tagName = "RESPONSE")
    private ResponseBean response;

    @RspField(tagName = "COM_BUS_INFO")
    private ComBusInfoBean comBusInfo;

    @RspField(tagName = "SP_RESERVE")
    private SPReserveBean sPReserve;

    @RspField(tagName = "MSG_SENDER")
    private String msgSender;

    @RspField(tagName = "MSG_RECEIVER")
    private String msgReceiver;

    public String getOrigDomain() {
        return origDomain;
    }

    public void setOrigDomain(String origDomain) {
        this.origDomain = origDomain;
    }

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

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getActionRelation() {
        return actionRelation;
    }

    public void setActionRelation(String actionRelation) {
        this.actionRelation = actionRelation;
    }

    public RoutingBean getRouting() {
        return routing;
    }

    public void setRouting(RoutingBean routing) {
        this.routing = routing;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getTransIDO() {
        return transIDO;
    }

    public void setTransIDO(String transIDO) {
        this.transIDO = transIDO;
    }

    public String getTransIDH() {
        return transIDH;
    }

    public void setTransIDH(String transIDH) {
        this.transIDH = transIDH;
    }

    public String getProcessTime() {
        return processTime;
    }

    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
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
