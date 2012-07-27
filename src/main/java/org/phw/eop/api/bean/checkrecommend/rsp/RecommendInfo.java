package org.phw.eop.api.bean.checkrecommend.rsp;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 推荐人校验接口 返回报文中 推荐人信息
 * @author lita
 *
 */
public class RecommendInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @RspField(tagName = "RecommendName")
    private String recommendName;

    @RspField(tagName = "RecommendNumber")
    private String recommendNumber;

    public String getRecommendName() {
        return recommendName;
    }

    public void setRecommendName(String recommendName) {
        this.recommendName = recommendName;
    }

    public String getRecommendNumber() {
        return recommendNumber;
    }

    public void setRecommendNumber(String recommendNumber) {
        this.recommendNumber = recommendNumber;
    }

}
