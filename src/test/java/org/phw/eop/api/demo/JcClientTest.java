package org.phw.eop.api.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    /**
     * 卡应用下载模拟
     * @throws ApiException
     * @throws InterruptedException
     */
    @Test
    public void testJCCardDownLoad() throws ApiException, InterruptedException {
        JcCardReq req = new JcCardReq();
        req.setReqBean(createFirstSessionBean("0x05"));

        JcCardRsp eopRsp = client.execute(req);
        JcCardCobRsq jcCardCobRsq = eopRsp.getJcCardCobRsq();
        Assert.assertFalse(jcCardCobRsq.isHasMsg());
        Assert.assertEquals("2", jcCardCobRsq.getResult());
        String sessionID = jcCardCobRsq.getSessionID();

        while (true) {
            Thread.sleep(5000);
            req.setReqBean(createInSessionBean(sessionID));

            eopRsp = client.execute(req);
            jcCardCobRsq = eopRsp.getJcCardCobRsq();
            if (!jcCardCobRsq.isHasMsg()) {
                continue;
            }

            // 取到if2bean内容
            JcCardIfMsgRsq if2Bean = jcCardCobRsq.getIf2Bean();
            if (null != if2Bean) {
                Assert.assertEquals("IF2 Request Content.", if2Bean.getRspDate());
            }

            List<JcCardIfMsgRsq> if3Beans = jcCardCobRsq.getIf3Beans();
            if (null != if3Beans) {
                final List<String> if3Msgs = new ArrayList<String>();
                if3Msgs.add("IF3 Request Content.");
                //            if3Msgs.add("再次测试消息");
                for (JcCardIfMsgRsq if3 : if3Beans) {
                    Assert.assertTrue(if3Msgs.contains(if3.getRspDate()));
                }
            }

            JcCardIf1Rsq if1Bean = jcCardCobRsq.getIf1Bean();
            if (null != if1Bean) {
                Assert.assertEquals("0", if1Bean.getResult());
                //                List<JcAppBean> beanLst = if1Bean.getBeanLst();
                //                for (JcAppBean bean : beanLst) {
                //                    String append = bean.getName() + "|" + bean.getAid() + "|" + bean.getAppSize() + "|"
                //                }
            }

            String result = jcCardCobRsq.getResult();
            if ("1".equals(result)) {
                break;
            }
        }
    }

    private JcCardReqBean createFirstSessionBean(String missionType) {
        JcCardReqBean reqBean = new JcCardReqBean();
        //        reqBean.setFirstCardSession(true);
        //        final String sessionID = "1234567891";
        //        reqBean.setSessionID(sessionID);
        reqBean.setBusinessType("0x00");
        reqBean.setArea("3400");
        reqBean.setProvince("34");
        reqBean.setCity("340");
        reqBean.setChannelType("01");
        reqBean.setChannel("000000");
        reqBean.setIdCard("320106198602041213");
        reqBean.setMsisdn("12345678901");
        reqBean.setIccid("8912345678");
        reqBean.setImsi("46568974");
        reqBean.setOperateType("0x01");
        reqBean.setMissionType(missionType);
        reqBean.setReqData("aid");
        reqBean.setProductNum(1);
        reqBean.setOperatorID("000089");
        return reqBean;
    }

    private JcCardReqBean createInSessionBean(String sessionID) {
        JcCardReqBean reqBean = new JcCardReqBean();
        //        reqBean.setFirstCardSession(false);
        //        final String sessionID = "1234567891";
        reqBean.setSessionID(sessionID);
        reqBean.setBusinessType("0x00");
        reqBean.setArea("3400");
        reqBean.setProvince("34");
        reqBean.setCity("340");
        reqBean.setChannelType("01");
        reqBean.setChannel("000000");
        reqBean.setIdCard("320106198602041213");
        reqBean.setMsisdn("12345678901");
        reqBean.setIccid("8912345678");
        reqBean.setImsi("46568974");
        reqBean.setOperateType("0x01");
        reqBean.setMissionType("0x05");
        reqBean.setReqData("aid");
        reqBean.setProductNum(1);
        reqBean.setOperatorID("000089");
        return reqBean;
    }

    //    @Test
    public void testDb() throws ApiException {
        JcCardReq req = new JcCardReq();

        JcCardReqBean reqBean = new JcCardReqBean();
        //        reqBean.setFirstCardSession(false);
        // 需要和库里数据一致
        final String sessionID = UUID.randomUUID().toString().substring(0, 20);
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
    public void testIf1BeanRsp() throws ApiException {
        JcCardReq req = new JcCardReq();

        JcCardReqBean reqBean = new JcCardReqBean();
        //        reqBean.setFirstCardSession(false);
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

    /**
     * 模拟卡校验接口
     * @throws ApiException
     */
    @Test
    public void testJCCardValidate() throws ApiException {
        cardInTimeOperate("0x01");
    }

    /**
     * 模拟卡可下载应用请求
     * @throws ApiException
     */
    @Test
    public void testJCCardCanDownLoadApp() throws ApiException {
        cardInTimeOperate("0x02");
    }

    /**
     * 模拟卡已下载应用请求
     * @throws ApiException
     */
    @Test
    public void testJCCardHasDownLoadApp() throws ApiException {
        cardInTimeOperate("0x03");
    }

    /**
     * 模拟卡首页更新
     * @throws ApiException
     */
    @Test
    public void testJCCardUpdateIndex() throws ApiException {
        cardInTimeOperate("0x04");
    }

    /**
     * 卡应用及时性操作
     * @throws ApiException
     */
    private void cardInTimeOperate(String missionType) throws ApiException {
        JcCardReq req = new JcCardReq();
        req.setReqBean(createFirstSessionBean(missionType));

        JcCardRsp eopRsp = client.execute(req);
        JcCardCobRsq jcCardCobRsq = eopRsp.getJcCardCobRsq();
        Assert.assertTrue(jcCardCobRsq.isHasMsg());
        Assert.assertEquals("1", jcCardCobRsq.getResult());
    }

    /**
     * 模拟卡删除接口
     * @throws ApiException 
     * @throws InterruptedException 
     * 
     */
    @Test
    public void testJCCardDelete() throws ApiException, InterruptedException {
        // 卡延迟类操作
        cardDelayOperate("0x06");
    }

    /**
     * 模拟卡锁定接口
     * @throws ApiException 
     * @throws InterruptedException 
     * 
     */
    @Test
    public void testJCCardLock() throws ApiException, InterruptedException {
        // 卡延迟类操作
        cardDelayOperate("0x07");
    }

    /**
     * 模拟卡解锁接口
     * @throws ApiException 
     * @throws InterruptedException 
     * 
     */
    @Test
    public void testJCCardUnlock() throws ApiException, InterruptedException {
        // 卡延迟类操作
        cardDelayOperate("0x08");
    }

    /**
     * 模拟卡更新接口
     * @throws ApiException 
     * @throws InterruptedException 
     * 
     */
    @Test
    public void testJCCardUpdate() throws ApiException, InterruptedException {
        // 卡延迟类操作
        cardDelayOperate("0x09");
    }

    /**
     * @throws ApiException
     * @throws InterruptedException
     */
    private void cardDelayOperate(String missionType) throws ApiException, InterruptedException {
        JcCardReq req = new JcCardReq();
        req.setReqBean(createFirstSessionBean(missionType));
        JcCardRsp eopRsp = client.execute(req);
        JcCardCobRsq jcCardCobRsq = eopRsp.getJcCardCobRsq();
        Assert.assertFalse(jcCardCobRsq.isHasMsg());
        Assert.assertEquals("2", jcCardCobRsq.getResult());
        String sessionID = jcCardCobRsq.getSessionID();

        while (true) {
            Thread.sleep(5000);
            req.setReqBean(createInSessionBean(sessionID));

            eopRsp = client.execute(req);
            jcCardCobRsq = eopRsp.getJcCardCobRsq();
            if (!jcCardCobRsq.isHasMsg()) {
                continue;
            }

            // 取到if2bean内容
            JcCardIfMsgRsq if2Bean = jcCardCobRsq.getIf2Bean();
            if (null != if2Bean) {
                Assert.assertEquals("IF2 Request Content.", if2Bean.getRspDate());
            }

            List<JcCardIfMsgRsq> if3Beans = jcCardCobRsq.getIf3Beans();
            if (null != if3Beans) {
                final List<String> if3Msgs = new ArrayList<String>();
                if3Msgs.add("IF3 Request Content.");
                //            if3Msgs.add("再次测试消息");
                for (JcCardIfMsgRsq if3 : if3Beans) {
                    Assert.assertTrue(if3Msgs.contains(if3.getRspDate()));
                }
            }

            JcCardIf1Rsq if1Bean = jcCardCobRsq.getIf1Bean();
            if (null != if1Bean) {
                Assert.assertEquals("0", if1Bean.getResult());
                //                List<JcAppBean> beanLst = if1Bean.getBeanLst();
                //                for (JcAppBean bean : beanLst) {
                //                    String append = bean.getName() + "|" + bean.getAid() + "|" + bean.getAppSize() + "|"
                //                }
            }

            String result = jcCardCobRsq.getResult();
            if ("1".equals(result)) {
                break;
            }
        }
    }

    /**
     * 测试检验是否成功
     * @throws ApiException 
     */
    @Test
    public void testValidator() throws ApiException {
        JcCardReq req = new JcCardReq();
        JcCardReqBean reqBean = new JcCardReqBean();
        //        reqBean.setFirstCardSession(true);
        final String sessionID = "1234567891";
        reqBean.setSessionID(sessionID);
        reqBean.setBusinessType("0x00");
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
        reqBean.setMissionType("0x01");
        reqBean.setReqData("aid");
        reqBean.setProductNum(1);
        reqBean.setOperatorID("000089");

        req.setReqBean(reqBean);
        JcCardRsp eopRsp = client.execute(req);
        JcCardCobRsq jcCardCobRsq = eopRsp.getJcCardCobRsq();
        String result = jcCardCobRsq.getResult();
        Assert.assertEquals("0", result);
    }
}
