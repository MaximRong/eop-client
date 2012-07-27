package org.phw.eop.api.bean.checknum.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 资源信息Bean（请求）。
 * @author xrx
 */
public class ResourcesInfoBean {

    @ReqField(tagName = "KeyChangeTag")
    private String keyChangeTag;

    @ReqField(tagName = "OldKey")
    private String oldKey;

    @ReqField(tagName = "ProKeyMode")
    private String proKeyMode;

    @ReqField(tagName = "ProKey")
    private String proKey;

    @ReqField(tagName = "GroupKey")
    private String groupKey;

    @ReqField(tagName = "ResourcesType")
    private String resourcesType;

    @ReqField(tagName = "ResourcesCode")
    private String resourcesCode;

    @ReqField(tagName = "OldResourcesCode")
    private String oldResourcesCode;

    @ReqField(tagName = "OccupiedFlag")
    private String occupiedFlag;

    @ReqField(tagName = "DelayOccupiedFlag")
    private String delayOccupiedFlag;

    @ReqField(tagName = "OccupiedTime")
    private String occupiedTime;

    @ReqField(tagName = "CustName")
    private String custName;

    @ReqField(tagName = "CertType")
    private String certType;

    @ReqField(tagName = "CertNum")
    private String certNum;

    @ReqField(tagName = "PreOrderTag")
    private String preOrderTag;

    @ReqField(tagName = "SnChangeTag")
    private String snChangeTag;

    @ReqField(tagName = "ContactNum")
    private String contactNum;

    @ReqField(tagName = "ProductID")
    private String productID;

    @ReqField(tagName = "AcceptChannelTag")
    private String acceptChannelTag;

    @ReqField(tagName = "DevelopPersonTag")
    private String developPersonTag;

    @ReqField(tagName = "RecomPersonID")
    private String recomPersonID;

    @ReqField(tagName = "RecomDeparID")
    private String recomDeparID;

    @ReqField(tagName = "Remark")
    private String remark;

    public String getKeyChangeTag() {
        return keyChangeTag;
    }

    public void setKeyChangeTag(String keyChangeTag) {
        this.keyChangeTag = keyChangeTag;
    }

    public String getOldKey() {
        return oldKey;
    }

    public void setOldKey(String oldKey) {
        this.oldKey = oldKey;
    }

    public String getProKeyMode() {
        return proKeyMode;
    }

    public void setProKeyMode(String proKeyMode) {
        this.proKeyMode = proKeyMode;
    }

    public String getProKey() {
        return proKey;
    }

    public void setProKey(String proKey) {
        this.proKey = proKey;
    }

    public String getGroupKey() {
        return groupKey;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    public String getResourcesType() {
        return resourcesType;
    }

    public void setResourcesType(String resourcesType) {
        this.resourcesType = resourcesType;
    }

    public String getResourcesCode() {
        return resourcesCode;
    }

    public void setResourcesCode(String resourcesCode) {
        this.resourcesCode = resourcesCode;
    }

    public String getOldResourcesCode() {
        return oldResourcesCode;
    }

    public void setOldResourcesCode(String oldResourcesCode) {
        this.oldResourcesCode = oldResourcesCode;
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

    public String getPreOrderTag() {
        return preOrderTag;
    }

    public void setPreOrderTag(String preOrderTag) {
        this.preOrderTag = preOrderTag;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSnChangeTag() {
        return snChangeTag;
    }

    public void setSnChangeTag(String snChangeTag) {
        this.snChangeTag = snChangeTag;
    }

    public String getAcceptChannelTag() {
        return acceptChannelTag;
    }

    public void setAcceptChannelTag(String acceptChannelTag) {
        this.acceptChannelTag = acceptChannelTag;
    }

    public String getDevelopPersonTag() {
        return developPersonTag;
    }

    public void setDevelopPersonTag(String developPersonTag) {
        this.developPersonTag = developPersonTag;
    }

    public String getRecomPersonID() {
        return recomPersonID;
    }

    public void setRecomPersonID(String recomPersonID) {
        this.recomPersonID = recomPersonID;
    }

    public String getRecomDeparID() {
        return recomDeparID;
    }

    public void setRecomDeparID(String recomDeparID) {
        this.recomDeparID = recomDeparID;
    }

    public String getDelayOccupiedFlag() {
        return delayOccupiedFlag;
    }

    public void setDelayOccupiedFlag(String delayOccupiedFlag) {
        this.delayOccupiedFlag = delayOccupiedFlag;
    }

}
