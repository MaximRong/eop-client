package org.phw.eop.api.bean.submitorder.rsp;

import java.io.Serializable;
import java.util.List;

import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.internal.mapping.annotation.EopBean;

/**
 * 订单提交返回报文体Bean
 * 
 * @author max
 */
@EopBean
public class SubmitOrderRspBody implements Serializable {

    private static final long serialVersionUID = 1L;

    private String            RespCode;

    private String            respDesc;

    private String            MallOrderNo;

    private List<ParaBean>    para;

    public String getRespCode() {
        return RespCode;
    }

    public void setRespCode(String respCode) {
        RespCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public String getMallOrderNo() {
        return MallOrderNo;
    }

    public void setMallOrderNo(String mallOrderNo) {
        MallOrderNo = mallOrderNo;
    }

    public List<ParaBean> getPara() {
        return para;
    }

    public void setPara(List<ParaBean> para) {
        this.para = para;
    }

}
