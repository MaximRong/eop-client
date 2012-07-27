package org.phw.eop.api.internal.mapping.propmapping;

/**
 * 同Field名称。
 *
 * @author wanglei
 *
 * 2012-1-16
 */
public class PropMappingFieldName implements IPropMapping {

    @Override
    public String convert(String name) {
        return name;
    }

}
