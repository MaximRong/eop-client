package org.phw.eop.api;

import org.phw.eop.api.internal.util.EopMap;

public class EopReq implements Req<EopRsp> {
    private String action;
    private String apptx;
    private EopMap params = new EopMap();
    private EopMap securetValueParams = new EopMap();
    private EopMap securetKeyValueParams = new EopMap();
    private boolean mock;

    public EopReq(String action) {
        this.action = action;
    }

    @Override
    public EopMap getSecuretValueParams() {
        return securetValueParams;
    }

    @Override
    public EopMap getSecuretKeyValueParams() {
        return securetKeyValueParams;
    }

    public String putSecuret4KeyValue(String key, Object value) {
        return securetKeyValueParams.put(key, value);
    }

    public String putSecuret4Value(String key, Object value) {
        return securetValueParams.put(key, value);
    }

    public String put(String key, Object value) {
        return params.put(key, value);
    }

    @Override
    public String getAction() {
        return action;
    }

    @Override
    public EopMap getParams() {
        return params;
    }

    @Override
    public String getApptx() {
        return apptx;
    }

    @Override
    public boolean isMock() {
        return mock;
    }

    public void setApptx(String apptx) {
        this.apptx = apptx;
    }

    public void setMock(boolean mock) {
        this.mock = mock;
    }

    @Override
    public Class<EopRsp> getRspClass() {
        return EopRsp.class;
    }

}
