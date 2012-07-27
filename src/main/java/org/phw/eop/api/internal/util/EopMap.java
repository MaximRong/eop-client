package org.phw.eop.api.internal.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.phw.eop.api.Constants;

import com.alibaba.fastjson.JSON;

public class EopMap extends HashMap<String, String> {
    private static final long serialVersionUID = -1277791390393392630L;

    public EopMap() {
        super();
    }

    public EopMap(Map<? extends String, ? extends String> m) {
        super(m);
    }

    public String put(String key, Object value) {
        String strValue;

        if (value == null) {
            strValue = null;
        }
        else if (value instanceof String) {
            strValue = (String) value;
        }
        else if (value instanceof Integer) {
            strValue = ((Integer) value).toString();
        }
        else if (value instanceof Long) {
            strValue = ((Long) value).toString();
        }
        else if (value instanceof Float) {
            strValue = ((Float) value).toString();
        }
        else if (value instanceof Double) {
            strValue = ((Double) value).toString();
        }
        else if (value instanceof Boolean) {
            strValue = ((Boolean) value).toString();
        }
        else if (value instanceof Date) {
            DateFormat format = new SimpleDateFormat(Constants.DATE_TIME_FORMAT);
            format.setTimeZone(TimeZone.getTimeZone(Constants.DATE_TIMEZONE));
            strValue = format.format((Date) value);
        }
        else {
            strValue = JSON.toJSONString(value);
        }

        return put(key, strValue);
    }

    @Override
    public String put(String key, String value) {
        if (!StringUtils.isEmpty(key)) {
            return super.put(key, value);
        }
        return null;
    }
}
