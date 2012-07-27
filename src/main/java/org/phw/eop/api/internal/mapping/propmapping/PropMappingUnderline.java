package org.phw.eop.api.internal.mapping.propmapping;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.phw.eop.api.internal.util.Strings;

/**
 * 驼峰+下划线。
 * 如：abcDeFh -> Abc_De_Fh，AbcDeFh -> Abc_De_Fh
 *
 * @author wanglei
 *
 * 2012-1-16
 */
public class PropMappingUnderline implements IPropMapping {

    @Override
    public String convert(String name) {
        String capital = Strings.capitalize(name);
        if (capital == null) {
            return null;
        }
        StringBuffer underline = new StringBuffer();
        Pattern pattern = Pattern.compile("[A-Z]");
        for (int i = 0; i < capital.length(); i++) {
            String tmp = capital.substring(i, i + 1);
            Matcher matcher = pattern.matcher(tmp);
            if (matcher.find() && i > 0) {
                underline.append("_" + tmp);
            }
            else {
                underline.append(tmp);
            }
        }
        return underline.toString();
    }

}
