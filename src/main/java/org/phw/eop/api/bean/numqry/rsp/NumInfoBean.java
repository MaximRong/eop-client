package org.phw.eop.api.bean.numqry.rsp;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.numqry.req.GroupInfoBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 号码查询接口返回号码bean
 * 
 * @author zhaowj
 *         2012-1-10
 */
@EopBean
public class NumInfoBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String numID;
    private String numMemo;
    private String numPreFee;
    private String city;
    private String numLevel;
    private String preOrderTag;
    private String niceRuleTag;
    private String useType;
    private String numProduct;
    private String numRelNum;
    private List<GroupInfoBean> groupInfo;

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String getNumMemo() {
        return numMemo;
    }

    public void setNumMemo(String numMemo) {
        this.numMemo = numMemo;
    }

    public String getNumPreFee() {
        return numPreFee;
    }

    public void setNumPreFee(String numPreFee) {
        this.numPreFee = numPreFee;
    }

    public String getNumLevel() {
        return numLevel;
    }

    public void setNumLevel(String numLevel) {
        this.numLevel = numLevel;
    }

    public String getNumProduct() {
        return numProduct;
    }

    public void setNumProduct(String numProduct) {
        this.numProduct = numProduct;
    }

    public String getNumRelNum() {
        return numRelNum;
    }

    public void setNumRelNum(String numRelNum) {
        this.numRelNum = numRelNum;
    }

    public List<GroupInfoBean> getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(List<GroupInfoBean> groupInfo) {
        this.groupInfo = groupInfo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPreOrderTag() {
        return preOrderTag;
    }

    public void setPreOrderTag(String preOrderTag) {
        this.preOrderTag = preOrderTag;
    }

    public String getNiceRuleTag() {
        return niceRuleTag;
    }

    public void setNiceRuleTag(String niceRuleTag) {
        this.niceRuleTag = niceRuleTag;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }
}
