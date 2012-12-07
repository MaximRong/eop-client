package org.phw.eop.api.internal.parser.json;

import org.phw.eop.api.ApiException;
import org.phw.eop.api.EopParser;
import org.phw.eop.api.Rsp;
import org.phw.eop.api.internal.mapping.Converter;

/**
 * 单个JSON对象解释器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ObjectJsonParser<T extends Rsp> implements EopParser<T> {

    private Class<T> clazz;

    public ObjectJsonParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public T parse(Object rsp) throws ApiException {
        Converter converter = new JsonConverter();
        return converter.toResponse((String) rsp, this.clazz);
    }

    @Override
    public Class<T> getResponseClass() {
        return this.clazz;
    }

}
