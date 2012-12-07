package org.phw.eop.api.bean.querysnuser.rsp;

import java.util.List;

import org.phw.eop.api.bean.querysnuser.common.FBSParaBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.RspField;

@EopBean
public class QuerySnUserRspBody {
    @RspField(tagName = "RESP_CODE")
    private String respCode;

    @RspField(tagName = "RESP_DESC")
    private String respDesc;

    @RspField(tagName = "CUST_INFO")
    private CustInfoBean custInfo;

    @RspField(tagName = "USER_INFO")
    private UserInfoBean userInfo;

    @RspField(tagName = "ACCT_INFO")
    private AcctInfoBean accInfoBean;

    @RspField(tagName = "SCORE_THRESHOLD_FLAG")
    private String scoreThresholdFlag;

    @RspField(tagName = "FOREGIFT_FEE_INFO")
    private List<ForegiftFeeInfoBean> foregiftFeeInfo;

    @RspField(tagName = "POST")
    private List<PostBean> post;

    @RspField(tagName = "PARA")
    private List<FBSParaBean> para;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public AcctInfoBean getAccInfoBean() {
        return accInfoBean;
    }

    public void setAccInfoBean(AcctInfoBean accInfoBean) {
        this.accInfoBean = accInfoBean;
    }

    public String getScoreThresholdFlag() {
        return scoreThresholdFlag;
    }

    public void setScoreThresholdFlag(String scoreThresholdFlag) {
        this.scoreThresholdFlag = scoreThresholdFlag;
    }

    public List<ForegiftFeeInfoBean> getForegiftFeeInfo() {
        return foregiftFeeInfo;
    }

    public void setForegiftFeeInfo(List<ForegiftFeeInfoBean> foregiftFeeInfo) {
        this.foregiftFeeInfo = foregiftFeeInfo;
    }

    public List<PostBean> getPost() {
        return post;
    }

    public void setPost(List<PostBean> post) {
        this.post = post;
    }

    public List<FBSParaBean> getPara() {
        return para;
    }

    public void setPara(List<FBSParaBean> para) {
        this.para = para;
    }

    public CustInfoBean getCustInfo() {
        return custInfo;
    }

    public void setCustInfo(CustInfoBean custInfo) {
        this.custInfo = custInfo;
    }

    public UserInfoBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBean userInfo) {
        this.userInfo = userInfo;
    }

}
