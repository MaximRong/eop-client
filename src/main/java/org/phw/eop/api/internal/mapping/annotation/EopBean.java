package org.phw.eop.api.internal.mapping.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.phw.eop.api.internal.mapping.SecuretType;
import org.phw.eop.api.internal.mapping.propmapping.IPropMapping;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFirstCapital;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
public @interface EopBean {
    public Class<? extends IPropMapping> propMapping() default PropMappingFirstCapital.class;

    public SecuretType securete() default SecuretType.NONE;
}
