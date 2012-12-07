package org.phw.eop.api.bean.querysnuser.req;

import java.util.List;

import org.phw.eop.api.bean.querysnuser.common.FBSParaBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 老用户三户资料查询接口请求Bean
 * 
 * @author Lurker
 * 
 */
public class QuerySnUserReqBody {

    @ReqField(tagName = "TRADE_TYPE_CODE")
    private String tradeTypeCode;

    @ReqField(tagName = "SERVICE_CLASS_CODE")
    private String serviceClassMode;

    @ReqField(tagName = "AREA_CODE")
    private String areaCode;

    @ReqField(tagName = "SERIAL_NUMBER")
    private String serialNumber;

    @ReqField(tagName = "USER_PASSWD")
    private String userPasswd;

    @ReqField(tagName = "GET_MODE")
    private String getMode;

    @ReqField(tagName = "PARA")
    private List<FBSParaBean> para;

    public String getTradeTypeCode() {
        return tradeTypeCode;
    }

    public void setTradeTypeCode(String tradeTypeCode) {
        this.tradeTypeCode = tradeTypeCode;
    }

    public String getServiceClassMode() {
        return serviceClassMode;
    }

    public void setServiceClassMode(String serviceClassMode) {
        this.serviceClassMode = serviceClassMode;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public String getGetMode() {
        return getMode;
    }

    public void setGetMode(String getMode) {
        this.getMode = getMode;
    }

    public List<FBSParaBean> getPara() {
        return para;
    }

    public void setPara(List<FBSParaBean> para) {
        this.para = para;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

}
