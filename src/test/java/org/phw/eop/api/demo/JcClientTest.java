package org.phw.eop.api.demo;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.phw.eop.api.ApiException;
import org.phw.eop.api.EopClient;
import org.phw.eop.api.bean.jccard.JcCardReq;
import org.phw.eop.api.bean.jccard.JcCardRsp;
import org.phw.eop.api.bean.jccard.req.JcCardReqBean;
import org.phw.eop.api.bean.jccard.rsp.JcCardCobRsq;
import org.phw.eop.api.bean.jccard.rsp.JcCardIf1Rsq;
import org.phw.eop.api.bean.jccard.rsp.JcCardIfMsgRsq;

public class JcClientTest {

    protected static String url = "http://127.0.0.1:7001/phw-eop";
    protected static String appcode = "D765425380464D8EAB5A9F51249FE4C0";
    protected static String signKey = "bhgjDQRazK4bNAof1F0jnyITv0TmGdvENrHC9+eIWG0k5KKpg1Ag9DMXMdOyuB5d9NWX/dLNxKZ5FBX/UCOBNQ==";
    private EopClient client;

    @Before
    public void before() {
        client = new EopClient(url, appcode, signKey);
        client.setSignAlgorithm("hmac");
        client.setParamKey("IRQ50Zz8HqByTo+waEICjw==");
    }

    @Test
    public void testMina() throws ApiException {
        JcCardReq req = new JcCardReq();

        JcCardReqBean reqBean = new JcCardReqBean();
        reqBean.setIsFirst(true);
        final String sessionID = "1234567891";
        reqBean.setSessionID(sessionID);
        reqBean.setBusinessType("0x01");
        reqBean.setArea("3400");
        reqBean.setProvince("34");
        reqBean.setCity("340");
        reqBean.setChannelType("01");
        reqBean.setChannel("000000");
        reqBean.setIdCard("320106198602041213");
        reqBean.setMsisdn("123123");
        reqBean.setIccid("iccid");
        reqBean.setImsi("imsi");
        reqBean.setOperateType("0x01");
        reqBean.setMissionType("0x05");
        reqBean.setReqData("aid");
        reqBean.setProductNum(1);
        reqBean.setOperatorID("000089");
        req.setReqBean(reqBean);

        JcCardRsp eopRsp = client.execute(req);
        JcCardCobRsq jcCardCobRsq = eopRsp.getJcCardCobRsq();

        Assert.assertTrue(jcCardCobRsq.isHasMsg());
        // 取到if2bean内容
        JcCardIfMsgRsq if2Bean = jcCardCobRsq.getIf2Bean();
        Assert.assertEquals("if2", if2Bean.getRspDate());
        List<JcCardIfMsgRsq> if3Beans = jcCardCobRsq.getIf3Beans();
        final List<String> if3Msgs = new ArrayList<String>();
        if3Msgs.add("测试返回消息");
        if3Msgs.add("再次测试消息");
        for (JcCardIfMsgRsq if3 : if3Beans) {
            Assert.assertTrue(if3Msgs.contains(if3.getRspDate()));
        }

        Assert.assertEquals("2", jcCardCobRsq.getResult());
    }

    //    @Test
    public void testDb() throws ApiException {
        JcCardReq req = new JcCardReq();

        JcCardReqBean reqBean = new JcCardReqBean();
        reqBean.setIsFirst(false);
        // 需要和库里数据一致
        final String sessionID = "1234567890";
        reqBean.setSessionID(sessionID);
        reqBean.setBusinessType("0x01");
        reqBean.setArea("3400");
        reqBean.setProvince("34");
        reqBean.setCity("340");
        reqBean.setChannelType("01");
        reqBean.setChannel("000000");
        reqBean.setIdCard("320106198602041213");
        reqBean.setMsisdn("123123");
        reqBean.setIccid("iccid");
        reqBean.setImsi("imsi");
        reqBean.setOperateType("0x01");
        reqBean.setMissionType("0x05");
        reqBean.setReqData("aid");
        reqBean.setProductNum(1);
        reqBean.setOperatorID("000089");
        req.setReqBean(reqBean);

        JcCardRsp eopRsp = client.execute(req);
        JcCardCobRsq jcCardCobRsq = eopRsp.getJcCardCobRsq();

        Assert.assertTrue(jcCardCobRsq.isHasMsg());
        // 取到if2bean内容
        JcCardIfMsgRsq if2Bean = jcCardCobRsq.getIf2Bean();
        Assert.assertEquals("if2", if2Bean.getRspDate());
        List<JcCardIfMsgRsq> if3Beans = jcCardCobRsq.getIf3Beans();
        final List<String> if3Msgs = new ArrayList<String>();
        if3Msgs.add("测试返回消息");
        if3Msgs.add("再次测试消息");
        for (JcCardIfMsgRsq if3 : if3Beans) {
            Assert.assertTrue(if3Msgs.contains(if3.getRspDate()));
        }

        Assert.assertEquals("2", jcCardCobRsq.getResult());
    }

    @Test
    public void testIf1BeanRsp() throws ApiException {
        JcCardReq req = new JcCardReq();

        JcCardReqBean reqBean = new JcCardReqBean();
        reqBean.setIsFirst(false);
        final String sessionID = "1234567891";
        reqBean.setSessionID(sessionID);
        reqBean.setBusinessType("0x01");
        reqBean.setArea("3400");
        reqBean.setProvince("34");
        reqBean.setCity("340");
        reqBean.setChannelType("01");
        reqBean.setChannel("000000");
        reqBean.setIdCard("320106198602041213");
        reqBean.setMsisdn("123123");
        reqBean.setIccid("iccid");
        reqBean.setImsi("imsi");
        reqBean.setOperateType("0x01");
        reqBean.setMissionType("0x05");
        reqBean.setReqData("aid");
        reqBean.setProductNum(1);
        reqBean.setOperatorID("000089");
        req.setReqBean(reqBean);

        JcCardRsp eopRsp = client.execute(req);
        JcCardCobRsq jcCardCobRsq = eopRsp.getJcCardCobRsq();

        Assert.assertTrue(jcCardCobRsq.isHasMsg());
        // 取到if2bean内容
        JcCardIfMsgRsq if2Bean = jcCardCobRsq.getIf2Bean();
        Assert.assertEquals("if2", if2Bean.getRspDate());
        List<JcCardIfMsgRsq> if3Beans = jcCardCobRsq.getIf3Beans();
        final List<String> if3Msgs = new ArrayList<String>();
        if3Msgs.add("测试返回消息");
        if3Msgs.add("再次测试消息");
        for (JcCardIfMsgRsq if3 : if3Beans) {
            Assert.assertTrue(if3Msgs.contains(if3.getRspDate()));
        }

        Assert.assertEquals("1", jcCardCobRsq.getResult());

        // 测试if1bean
        JcCardIf1Rsq if1Bean = jcCardCobRsq.getIf1Bean();
        Assert.assertTrue("2".equals(if1Bean.getAppNum()));

    }
}
