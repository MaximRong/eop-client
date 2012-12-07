package org.phw.eop.api.bean.ebase;

import org.n3r.core.beanverify.annotation.DefaultNotNull;
import org.n3r.core.beanverify.annotation.NotNull;
import org.n3r.core.beanverify.enumeration.NotNullWhen;
import org.n3r.core.xml.annotation.RXCData;
import org.n3r.core.xml.annotation.RXElement;
import org.n3r.core.xml.annotation.RXRootElement;
import org.n3r.core.xml.annotation.RXSkip;
import org.n3r.core.xml.utils.RXSkipWhen;
import org.phw.eop.api.bean.ebase.cmn.Response;
import org.phw.eop.api.bean.ebase.cmn.Routing;
import org.phw.eop.api.bean.ebase.cmn.SPReserve;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@DefaultNotNull
@EopBean(propMapping = PropMappingFieldName.class)
@RXRootElement("UniBSS")
public class EMessage<T> {

    private String origDomain;
    private String homeDomain;
    @RXElement("BIPCode")
    private String bipCode;
    @RXElement("BIPVer")
    private String bipVer;
    private String activityCode;
    private String actionCode;
    private String actionRelation;
    private Routing routing;
    private String procID;
    private String transIDO;
    @NotNull(NotNullWhen.Response)
    @RXSkip(RXSkipWhen.Null)
    private String transIDH;
    private String processTime;
    @NotNull(NotNullWhen.Response)
    @RXSkip(RXSkipWhen.Null)
    private Response response;
    @NotNull(NotNullWhen.None)
    @RXSkip(RXSkipWhen.Null)
    @RXElement("SPReserve")
    private SPReserve spReserve;
    private String testFlag;
    private String msgSender;
    private String msgReceiver;
    private String svcContVer;
    @RXCData
    private T svcCont;

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

    public String getBipCode() {
        return bipCode;
    }

    public void setBipCode(String bipCode) {
        this.bipCode = bipCode;
    }

    public String getBipVer() {
        return bipVer;
    }

    public void setBipVer(String bipVer) {
        this.bipVer = bipVer;
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

    public String getActionRelation() {
        return actionRelation;
    }

    public void setActionRelation(String actionRelation) {
        this.actionRelation = actionRelation;
    }

    public Routing getRouting() {
        return routing;
    }

    public void setRouting(Routing routing) {
        this.routing = routing;
    }

    public String getProcID() {
        return procID;
    }

    public void setProcID(String procID) {
        this.procID = procID;
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

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public SPReserve getSpReserve() {
        return spReserve;
    }

    public void setSpReserve(SPReserve spReserve) {
        this.spReserve = spReserve;
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

    public void setSvcCont(T svcCont) {
        this.svcCont = svcCont;
    }

    public T getSvcCont() {
        return svcCont;
    }

}
