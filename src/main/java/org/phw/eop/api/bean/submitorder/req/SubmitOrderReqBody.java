package org.phw.eop.api.bean.submitorder.req;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 订单提交请求报文体Bean
 * 
 * @author max
 */
@EopBean
public class SubmitOrderReqBody implements Serializable {

    private static final long serialVersionUID = 1L;

    private String            subscribeNo;

    private String            merchantCode;

    private String            subscribeTime;

    private String            subscribeState;

    private String            feeSum;

    private List<FeeInfoBean> feeInfo;

    private String            postage;

    private String            alreadyPay;

    private String            payType;

    private String            payState;

    private String            payWay;

    private String            invoTitle;

    private String            invoCont;

    private String            delvType;

    private String            delvDateType;

    private String            affirmTag;

    private String            recvCustName;

    private String            recvPsptType;

    private String            recvPsptNo;

    private String            recvLinkPhone;

    private String            recvFixPhone;

    private String            recvEmail;

    private String            rostProvince;

    private String            rostCity;

    private String            postDistrict;

    private String            postCode;

    private String            postAddr;

    private String            postRemark;

    private String            goodsId;

    private String            netCustName;

    private String            netPsptType;

    private String            netPsptNo;

    private String            netPhoneNo;

    private String            numProvince;

    private String            numCity;

    private String            numDistrict;

    private String            advancePay;

    private String            proKeyMode;

    private String            proKey;

    private String            netPhoneNoType;

    private List<ParaBean>    para;

    public String getSubscribeNo() {
        return subscribeNo;
    }

    public void setSubscribeNo(String subscribeNo) {
        this.subscribeNo = subscribeNo;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(String subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public String getSubscribeState() {
        return subscribeState;
    }

    public void setSubscribeState(String subscribeState) {
        this.subscribeState = subscribeState;
    }

    public String getFeeSum() {
        return feeSum;
    }

    public void setFeeSum(String feeSum) {
        this.feeSum = feeSum;
    }

    public List<FeeInfoBean> getFeeInfo() {
        return feeInfo;
    }

    public void setFeeInfo(List<FeeInfoBean> feeInfo) {
        this.feeInfo = feeInfo;
    }

    public String getPostage() {
        return postage;
    }

    public void setPostage(String postage) {
        this.postage = postage;
    }

    public String getAlreadyPay() {
        return alreadyPay;
    }

    public void setAlreadyPay(String alreadyPay) {
        this.alreadyPay = alreadyPay;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    public String getInvoTitle() {
        return invoTitle;
    }

    public void setInvoTitle(String invoTitle) {
        this.invoTitle = invoTitle;
    }

    public String getInvoCont() {
        return invoCont;
    }

    public void setInvoCont(String invoCont) {
        this.invoCont = invoCont;
    }

    public String getDelvType() {
        return delvType;
    }

    public void setDelvType(String delvType) {
        this.delvType = delvType;
    }

    public String getDelvDateType() {
        return delvDateType;
    }

    public void setDelvDateType(String delvDateType) {
        this.delvDateType = delvDateType;
    }

    public String getAffirmTag() {
        return affirmTag;
    }

    public void setAffirmTag(String affirmTag) {
        this.affirmTag = affirmTag;
    }

    public String getRecvCustName() {
        return recvCustName;
    }

    public void setRecvCustName(String recvCustName) {
        this.recvCustName = recvCustName;
    }

    public String getRecvPsptType() {
        return recvPsptType;
    }

    public void setRecvPsptType(String recvPsptType) {
        this.recvPsptType = recvPsptType;
    }

    public String getRecvPsptNo() {
        return recvPsptNo;
    }

    public void setRecvPsptNo(String recvPsptNo) {
        this.recvPsptNo = recvPsptNo;
    }

    public String getRecvLinkPhone() {
        return recvLinkPhone;
    }

    public void setRecvLinkPhone(String recvLinkPhone) {
        this.recvLinkPhone = recvLinkPhone;
    }

    public String getRecvFixPhone() {
        return recvFixPhone;
    }

    public void setRecvFixPhone(String recvFixPhone) {
        this.recvFixPhone = recvFixPhone;
    }

    public String getRecvEmail() {
        return recvEmail;
    }

    public void setRecvEmail(String recvEmail) {
        this.recvEmail = recvEmail;
    }

    public String getRostProvince() {
        return rostProvince;
    }

    public void setRostProvince(String rostProvince) {
        this.rostProvince = rostProvince;
    }

    public String getRostCity() {
        return rostCity;
    }

    public void setRostCity(String rostCity) {
        this.rostCity = rostCity;
    }

    public String getPostDistrict() {
        return postDistrict;
    }

    public void setPostDistrict(String postDistrict) {
        this.postDistrict = postDistrict;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostAddr() {
        return postAddr;
    }

    public void setPostAddr(String postAddr) {
        this.postAddr = postAddr;
    }

    public String getPostRemark() {
        return postRemark;
    }

    public void setPostRemark(String postRemark) {
        this.postRemark = postRemark;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getNetCustName() {
        return netCustName;
    }

    public void setNetCustName(String netCustName) {
        this.netCustName = netCustName;
    }

    public String getNetPsptType() {
        return netPsptType;
    }

    public void setNetPsptType(String netPsptType) {
        this.netPsptType = netPsptType;
    }

    public String getNetPsptNo() {
        return netPsptNo;
    }

    public void setNetPsptNo(String netPsptNo) {
        this.netPsptNo = netPsptNo;
    }

    public String getNetPhoneNo() {
        return netPhoneNo;
    }

    public void setNetPhoneNo(String netPhoneNo) {
        this.netPhoneNo = netPhoneNo;
    }

    public String getAdvancePay() {
        return advancePay;
    }

    public void setAdvancePay(String advancePay) {
        this.advancePay = advancePay;
    }

    public String getNetPhoneNoType() {
        return netPhoneNoType;
    }

    public void setNetPhoneNoType(String netPhoneNoType) {
        this.netPhoneNoType = netPhoneNoType;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getNumProvince() {
        return numProvince;
    }

    public void setNumProvince(String numProvince) {
        this.numProvince = numProvince;
    }

    public String getNumCity() {
        return numCity;
    }

    public void setNumCity(String numCity) {
        this.numCity = numCity;
    }

    public String getNumDistrict() {
        return numDistrict;
    }

    public void setNumDistrict(String numDistrict) {
        this.numDistrict = numDistrict;
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

}
