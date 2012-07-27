package org.phw.eop.api.bean.numqry.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 号码查询接口 --自定义号码bean
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
public class KeyBean {

    @ReqField(tagName = "KeyValue")
    private String keyValue;

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

}
