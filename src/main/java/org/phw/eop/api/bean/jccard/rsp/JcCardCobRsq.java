package org.phw.eop.api.bean.jccard.rsp;

import java.util.List;

import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.propmapping.PropMappingFieldName;

/**
 * 如果非即时消息，则返回组合bean.
 * 
 * @author maxim
 *
 */
@EopBean(propMapping = PropMappingFieldName.class)
public class JcCardCobRsq {

    // 是否有新消息 true 有新消息 false 无
    private boolean hasMsg;
    // 处理结果 0 失败 1 成功 2 处理中 
    private String result;

    // if2返回对象, 因为if2对象只会有一个 所以只设置一个
    private JcCardIfMsgRsq if2Bean;

    // if4返回对象, 因为if4对象只会有一个 所以只设置一个
    private JcCardIfMsgRsq if4Bean;

    // if3消息返回数组，if3可能会有多个，放入一个list中
    private List<JcCardIfMsgRsq> if3Beans;

    // if1消息返回, if1只可能返回1个
    private JcCardIf1Rsq if1Bean;

    public boolean isHasMsg() {
        return hasMsg;
    }

    public void setHasMsg(boolean hasMsg) {
        this.hasMsg = hasMsg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public JcCardIfMsgRsq getIf2Bean() {
        return if2Bean;
    }

    public void setIf2Bean(JcCardIfMsgRsq if2Bean) {
        this.if2Bean = if2Bean;
    }

    public JcCardIfMsgRsq getIf4Bean() {
        return if4Bean;
    }

    public void setIf4Bean(JcCardIfMsgRsq if4Bean) {
        this.if4Bean = if4Bean;
    }

    public List<JcCardIfMsgRsq> getIf3Beans() {
        return if3Beans;
    }

    public void setIf3Beans(List<JcCardIfMsgRsq> if3Beans) {
        this.if3Beans = if3Beans;
    }

    public void setIf1Bean(JcCardIf1Rsq if1Bean) {
        this.if1Bean = if1Bean;
    }

    public JcCardIf1Rsq getIf1Bean() {
        return if1Bean;
    }
}
