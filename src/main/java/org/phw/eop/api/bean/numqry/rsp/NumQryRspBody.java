package org.phw.eop.api.bean.numqry.rsp;

import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 号码查询接口返回报文体
 *
 * @author zhaowj
 *
 * 2012-1-10
 */
@EopBean
public class NumQryRspBody implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String respCode;

    private String respDesc;

    private List<NumInfoBean> numInfo;

    private List<ParaBean> para;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public List<NumInfoBean> getNumInfo() {
        return numInfo;
    }

    public void setNumInfo(List<NumInfoBean> numInfo) {
        this.numInfo = numInfo;
    }

}
