package org.phw.eop.api.bean.numqry.rsp;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 号码查询接口分组查询bean
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
@EopBean
public class GroupInfoBean implements java.io.Serializable {
    private static final long serialVersionUID = -171978469570958787L;
    private String groupKey;

    public String getGroupKey() {
        return groupKey;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

}
