package org.phw.eop.api.internal.mapping.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.phw.eop.api.internal.mapping.SecuretType;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.FIELD })
public @interface ReqField {
    public String tagName() default "";

    public boolean mappedOut() default false;

    public boolean emptyMapped() default false;

    public SecuretType securete() default SecuretType.NONE;

}
