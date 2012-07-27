package org.phw.eop.api.demo;

import java.util.List;

import org.phw.eop.api.Rsp;
import org.phw.eop.api.internal.mapping.annotation.RspField;

public class EopMockRsp extends Rsp {
    @RspField
    private List<EopMockBean> mockBeans;

    @Override
    public String toString() {
        return "EopMockRsp [mockBeans=" + mockBeans + "]";
    }

    public List<EopMockBean> getMockBeans() {
        return mockBeans;
    }

    public void setMockBeans(List<EopMockBean> mockBeans) {
        this.mockBeans = mockBeans;
    }

}
