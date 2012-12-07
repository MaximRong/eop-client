package org.phw.eop.api.bean.ebase.cmn;

import org.n3r.core.beanverify.annotation.DefaultNotNull;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

@DefaultNotNull
@EopBean(propMapping = PropMappingFieldName.class)
public class Routing {

    private String routeType;
    private String routeValue;

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public String getRouteType() {
        return routeType;
    }

    public void setRouteValue(String routeValue) {
        this.routeValue = routeValue;
    }

    public String getRouteValue() {
        return routeValue;
    }

}
