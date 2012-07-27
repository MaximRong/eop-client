package org.phw.eop.api.bean.numqry.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

/**
 * 号码查询接口--靓号类型bean
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
public class SnRoleBean {

    @ReqField(tagName = "RoleValue")
    private String roleValue;

    public String getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(String roleValue) {
        this.roleValue = roleValue;
    }

}
