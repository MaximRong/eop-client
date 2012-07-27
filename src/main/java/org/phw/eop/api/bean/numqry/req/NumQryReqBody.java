package org.phw.eop.api.bean.numqry.req;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 号码查询接口请求报文体。
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
@EopBean
public class NumQryReqBody {

    @ReqField(mappedOut = true)
    private OperBean oper;

    private String resourcesType;

    private String aLLQueryMode;

    private String backNumber;

    private String sortMode;

    private String groupMode;

    private List<GroupInfoBean> groupInfo;

    private String preFeeMode;

    private List<PreFeeBean> preFee;

    private String keyValueMode;

    private List<KeyBean> key;

    private String roleValueMode;

    private List<SnRoleBean> snRole;

    private String otherMode;

    private List<OtherBean> other;

    private List<ParaBean> para;

    public OperBean getOper() {
        return oper;
    }

    public void setOper(OperBean oper) {
        this.oper = oper;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

    public String getResourcesType() {
        return resourcesType;
    }

    public void setResourcesType(String resourcesType) {
        this.resourcesType = resourcesType;
    }

    public String getaLLQueryMode() {
        return aLLQueryMode;
    }

    public void setaLLQueryMode(String aLLQueryMode) {
        this.aLLQueryMode = aLLQueryMode;
    }

    public String getBackNumber() {
        return backNumber;
    }

    public void setBackNumber(String backNumber) {
        this.backNumber = backNumber;
    }

    public String getSortMode() {
        return sortMode;
    }

    public void setSortMode(String sortMode) {
        this.sortMode = sortMode;
    }

    public String getGroupMode() {
        return groupMode;
    }

    public void setGroupMode(String groupMode) {
        this.groupMode = groupMode;
    }

    public List<GroupInfoBean> getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(List<GroupInfoBean> groupInfo) {
        this.groupInfo = groupInfo;
    }

    public String getPreFeeMode() {
        return preFeeMode;
    }

    public void setPreFeeMode(String preFeeMode) {
        this.preFeeMode = preFeeMode;
    }

    public List<PreFeeBean> getPreFee() {
        return preFee;
    }

    public void setPreFee(List<PreFeeBean> preFee) {
        this.preFee = preFee;
    }

    public String getKeyValueMode() {
        return keyValueMode;
    }

    public void setKeyValueMode(String keyValueMode) {
        this.keyValueMode = keyValueMode;
    }

    public List<KeyBean> getKey() {
        return key;
    }

    public void setKey(List<KeyBean> key) {
        this.key = key;
    }

    public String getRoleValueMode() {
        return roleValueMode;
    }

    public void setRoleValueMode(String roleValueMode) {
        this.roleValueMode = roleValueMode;
    }

    public List<SnRoleBean> getSnRole() {
        return snRole;
    }

    public void setSnRole(List<SnRoleBean> snRole) {
        this.snRole = snRole;
    }

    public String getOtherMode() {
        return otherMode;
    }

    public void setOtherMode(String otherMode) {
        this.otherMode = otherMode;
    }

    public List<OtherBean> getOther() {
        return other;
    }

    public void setOther(List<OtherBean> other) {
        this.other = other;
    }

}
