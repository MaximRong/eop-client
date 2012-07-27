package org.phw.eop.api;

import org.phw.eop.api.internal.util.EopMap;

/**
 * EOP请求接口。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public interface Req<T extends Rsp> {

    /**
     * 获取EOP的API名称。
     * 
     * @return API名称
     */
    String getAction();

    /**
     * 获取客户端交易编号。
     * @return 交易编号
     */
    String getApptx();

    /**
     * 是否使用模拟返回。
     * @return 是否模拟
     */
    boolean isMock();

    /**
     * 获取所有的Key-Value形式的文本请求参数集合。其中：
     * <ul>
     * <li>Key: 请求参数名</li>
     * <li>Value: 请求参数值</li>
     * </ul>
     * 
     * @return 文本请求参数集合
     */
    EopMap getParams();

    /**
     * 获取参数值加密，参数名不加密的参数集合。
     * @return
     */
    EopMap getSecuretValueParams();

    /**
     * 获取参数名和参数值的需要加密的参数集合。
     * @return
     */
    EopMap getSecuretKeyValueParams();

    Class<T> getRspClass();

}
