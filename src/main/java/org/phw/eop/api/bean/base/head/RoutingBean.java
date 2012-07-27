package org.phw.eop.api.bean.base.head;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 路由Bean。
 *
 * @author wanglei
 *
 * 2012-1-10
 */
@EopBean
public class RoutingBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String routeType;

    private String routeValue;

    public String getRouteType() {
        return routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public String getRouteValue() {
        return routeValue;
    }

    public void setRouteValue(String routeValue) {
        this.routeValue = routeValue;
    }

}
