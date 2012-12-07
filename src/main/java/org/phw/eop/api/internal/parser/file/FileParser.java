package org.phw.eop.api.internal.parser.file;

import org.phw.eop.api.ApiException;
import org.phw.eop.api.EopParser;
import org.phw.eop.api.Rsp;

public class FileParser<T extends Rsp> implements EopParser<T> {

    private Class<T> clazz;

    public FileParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public T parse(Object rsp) throws ApiException {
        T rspObject;
        try {
            rspObject = clazz.newInstance();
        }
        catch (Exception e) {
            throw new ApiException(e);
        }
        rspObject.setRspcode("0");
        rspObject.setRspdesc("OK");
        rspObject.setRspmsg(rsp);
        return rspObject;
    }

    @Override
    public Class<T> getResponseClass() throws ApiException {
        return this.clazz;
    }

}
