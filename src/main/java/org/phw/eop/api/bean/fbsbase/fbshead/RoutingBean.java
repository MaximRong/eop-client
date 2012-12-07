package org.phw.eop.api.bean.fbsbase.fbshead;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;
import org.phw.eop.api.internal.mapping.annotation.RspField;

/**
 * 全业务路由Bean。
 * 
 * @author Lurker
 * 
 */
@EopBean
public class RoutingBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @ReqField(tagName = "ROUTE_TYPE")
    @RspField(tagName = "ROUTE_TYPE")
    private String routeType;

    @ReqField(tagName = "ROUTE_VALUE")
    @RspField(tagName = "ROUTE_VALUE")
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
