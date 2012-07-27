package org.phw.eop.api.bean.checkres.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 资源信息Bean（请求）。
 *
 * @author wanglei
 *
 * 2012-1-9
 */
public class ResourcesInfoBean {

    @ReqField(tagName = "ResourcesType")
    private String resourcesType;

    @ReqField(tagName = "ResCodeType")
    private String resCodeType;

    @ReqField(tagName = "ResourcesCode")
    private String resourcesCode;

    @ReqField(tagName = "OccupiedFlag")
    private String occupiedFlag;

    @ReqField(tagName = "OccupiedTime")
    private String occupiedTime;

    @ReqField(tagName = "CertType")
    private String certType;

    @ReqField(tagName = "CertNum")
    private String certNum;

    public String getResourcesType() {
        return resourcesType;
    }

    public void setResourcesType(String resourcesType) {
        this.resourcesType = resourcesType;
    }

    public String getResCodeType() {
        return resCodeType;
    }

    public void setResCodeType(String resCodeType) {
        this.resCodeType = resCodeType;
    }

    public String getResourcesCode() {
        return resourcesCode;
    }

    public void setResourcesCode(String resourcesCode) {
        this.resourcesCode = resourcesCode;
    }

    public String getOccupiedFlag() {
        return occupiedFlag;
    }

    public void setOccupiedFlag(String occupiedFlag) {
        this.occupiedFlag = occupiedFlag;
    }

    public String getOccupiedTime() {
        return occupiedTime;
    }

    public void setOccupiedTime(String occupiedTime) {
        this.occupiedTime = occupiedTime;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }
}
