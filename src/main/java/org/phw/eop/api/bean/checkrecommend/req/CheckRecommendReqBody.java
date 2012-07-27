package org.phw.eop.api.bean.checkrecommend.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 推荐人信息校验接口 请求报文体
 * @author lita
 *
 */
public class CheckRecommendReqBody {

    @ReqField(tagName = "OperatorID")
    private String operatorID;

    @ReqField(tagName = "Province")
    private String province;

    @ReqField(tagName = "City", emptyMapped = true)
    private String city;

    @ReqField(tagName = "CheckMode")
    private String checkMode;

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCheckMode() {
        return checkMode;
    }

    public void setCheckMode(String checkMode) {
        this.checkMode = checkMode;
    }
}
