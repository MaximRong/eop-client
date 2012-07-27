package org.phw.eop.api;

import java.util.Map;

public class EopRsp extends Rsp {
    private Map result;

    public void setResult(Map result) {
        this.result = result;
    }

    public Map getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "EopRsp [result=" + this.result + ", toString()=" + super.toString() + "]";
    }

}
