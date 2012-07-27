package org.phw.eop.api.internal.mapping.propmapping;

import org.phw.eop.api.internal.util.Strings;

/**
 * 首字母大写。
 * 如：abcDe -> AbcDe
 *
 * @author wanglei
 *
 * 2012-1-16
 */
public class PropMappingFirstCapital implements IPropMapping {

    @Override
    public String convert(String name) {
        return Strings.capitalize(name);
    }

}
