package org.phw.eop.api.internal.mapping.propmapping;


/**
 * 全部大写。
 * 如：abcDe -> ABCDE
 *
 * @author wanglei
 *
 * 2012-1-16
 */
public class PropMappingAllCapital implements IPropMapping {

    @Override
    public String convert(String name) {
        if (name == null) {
            return null;
        }
        return name.toUpperCase();
    }

}
