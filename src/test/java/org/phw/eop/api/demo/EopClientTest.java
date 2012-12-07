package org.phw.eop.api.demo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.phw.eop.api.ApiException;
import org.phw.eop.api.EopClient;
import org.phw.eop.api.EopReq;
import org.phw.eop.api.EopRsp;
import org.phw.eop.api.Req;
import org.phw.eop.api.bean.base.cmn.OperBean;
import org.phw.eop.api.bean.base.cmn.ParaBean;
import org.phw.eop.api.bean.base.head.ReqHeadBean;
import org.phw.eop.api.bean.base.head.RoutingBean;
import org.phw.eop.api.bean.checkres.CheckResReq;
import org.phw.eop.api.bean.checkres.CheckResRsp;
import org.phw.eop.api.bean.checkres.req.CheckResReqBody;
import org.phw.eop.api.bean.checkres.req.ResourcesInfoBean;
import org.phw.eop.api.bean.fbsbase.fbshead.ComBusInfoBean;
import org.phw.eop.api.bean.fbsbase.fbshead.SPReserveBean;
import org.phw.eop.api.bean.querysnuser.QuerySnUserReq;
import org.phw.eop.api.bean.querysnuser.QuerySnUserRsp;
import org.phw.eop.api.bean.querysnuser.req.QuerySnUserReqBody;
import org.phw.eop.api.internal.util.TypeUtils;

public class EopClientTest {
    public static class DemoBean {
        private String p1;
        private int p2;

        public String getP1() {
            return p1;
        }

        public void setP1(String p1) {
            this.p1 = p1;
        }

        public int getP2() {
            return p2;
        }

        public void setP2(int p2) {
            this.p2 = p2;
        }

    }

    public static class Person {
        private String name;
        private String sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

    }

    public static class DemoBean2 {
        private String p1;
        private Person p2;

        public String getP1() {
            return p1;
        }

        public void setP1(String p1) {
            this.p1 = p1;
        }

        public Person getP2() {
            return p2;
        }

        public void setP2(Person p2) {
            this.p2 = p2;
        }

    }

    // http://127.0.0.1:7001/phw-eop
    // 测试4mall http://10.142.151.86:7207/phw-eop
    // 测试4ess http://10.142.195.66:8708/eop4ess
    // 演示4ess http://10.142.195.66:6208/eop4ess
    // 演示4mall http://10.142.151.87:8103/phw-eop
    protected static String url = "http://127.0.0.1:7001/phw-eop";
    protected static String appcode = "D765425380464D8EAB5A9F51249FE4C0";
    protected static String signKey = "bhgjDQRazK4bNAof1F0jnyITv0TmGdvENrHC9+eIWG0k5KKpg1Ag9DMXMdOyuB5d9NWX/dLNxKZ5FBX/UCOBNQ==";
    private EopClient client;

    @Before
    public void before() {
        client = new EopClient(url, appcode, signKey);
        client.setSignAlgorithm("hmac");
        client.setParamKey("IRQ50Zz8HqByTo+waEICjw==");
        // client.setFormat("xml");
        // client.setProxy("127.0.0.1", 8888);
    }

    @Test
    public void testRefreshAction() throws ApiException {
	    /*
        EopReq eopReq = new EopReq("admin.cache.refresh");
        eopReq.put("cacheName", "action");
        eopReq.setApptx("testRefreshAction");

        EopRsp eopRsp = client.execute(eopReq);

        Assert.assertTrue(eopRsp.isSuccess());
		*/
    }

    //@Test
    public void testRefreshSchema() throws ApiException {
        EopReq eopReq = new EopReq("admin.cache.refresh");
        eopReq.put("cacheName", "schema");
        eopReq.setApptx("testRefreshSchema");
        EopRsp eopRsp = client.execute(eopReq);

        Assert.assertTrue(eopRsp.isSuccess());
    }

    //@Test
    public void testMockQuery1() throws ApiException {
        EopMockReq eopReq = new EopMockReq();
        eopReq.setAppid("9000");
        eopReq.setActionid("9001");

        EopMockRsp eopRsp = client.execute(eopReq);
        System.out.println(eopRsp);

        Assert.assertTrue(eopRsp.isSuccess());
    }

    //@Test
    public void testMockQuery2() throws ApiException {
        EopReq eopReq = new EopReq("admin.mock.query");
        eopReq.put("appid", "9000");
        eopReq.put("actionid", "9001");

        eopReq.setApptx("testMockQuery");
        EopRsp eopRsp = client.execute(eopReq);
        System.out.println(eopRsp);

        Assert.assertTrue(eopRsp.isSuccess());
    }

    //@Test
    public void testMockQuery3() throws ApiException {
        EopReq eopReq = new EopReq("admin.mock.query");
        eopReq.put("appid", "9000");
        eopReq.put("actionid", "9001");
        eopReq.put("arr1", "1^2^3");
        eopReq.put("arr2", "s1^s2^s3");

        eopReq.setApptx("testMockQuery");
        EopRsp eopRsp = client.execute(eopReq);
        System.out.println(eopRsp);

        Assert.assertTrue(eopRsp.isSuccess());
    }

    //@Test
    public void testParamCipher() throws ApiException, InterruptedException {
        // Value加密
        EopReq eopReq = new EopReq("admin.app.query");
        eopReq.put("appid", "9000");
        eopReq.put("card", "{p1:'bingoo',p2:8}");
        eopReq.putSecuret4Value("verse", "空手把锄头，步行骑水牛；人在桥上走，桥流水不流");
        eopReq.setApptx("Value Cipher");
        EopRsp eopRsp = client.execute(eopReq);
        System.out.println("Value Cipher: " + eopRsp.getResult());
        Assert.assertTrue(eopRsp.isSuccess());
        TimeUnit.SECONDS.sleep(3);

        // Key-Value加密
        eopReq = new EopReq("admin.app.query");
        eopReq.put("appid", "9000");
        eopReq.putSecuret4KeyValue("sheli", "诸法因缘生，缘谢法还灭。吾师大沙门，常作如是说。");
        eopReq.setApptx("Key-Value Cipher");
        eopRsp = client.execute(eopReq);
        System.out.println("Key-Value Cipher: " + eopRsp.getResult());
        Assert.assertTrue(eopRsp.isSuccess());
        TimeUnit.SECONDS.sleep(3);

        // All
        eopReq = new EopReq("admin.app.query");
        eopReq.put("appid", "9000");
        eopReq.putSecuret4Value("verse", "空手把锄头，步行骑水牛；人在桥上走，桥流水不流");
        eopReq.putSecuret4KeyValue("sheli", "诸法因缘生，缘谢法还灭。吾师大沙门，常作如是说。");
        eopReq.putSecuret4KeyValue("shansu", "作福不作恶，皆由宿行法，终不畏死经，如船截流渡。");
        eopReq.setApptx("All Cipher");
        eopRsp = client.execute(eopReq);
        System.out.println("All Cipher: " + eopRsp.getResult());
        Assert.assertTrue(eopRsp.isSuccess());
        TimeUnit.SECONDS.sleep(3);

        // None
        eopReq = new EopReq("admin.app.query");
        eopReq.put("appid", "9000");
        eopReq.setApptx("No Cipher");
        eopRsp = client.execute(eopReq);
        System.out.println("No Cipher: " + eopRsp.getResult());
        Assert.assertTrue(eopRsp.isSuccess());
    }

    //@Test
    public void testAppQueryJSONString() throws ApiException {
        EopReq eopReq = new EopReq("admin.app.query");
        eopReq.put("appid", "9000");

        // 第一种方式，直接JSON字符串
        eopReq.put("card", "{p1:'bingoo',p2:8}");

        eopReq.putSecuret4Value("verse", "空手把锄头，步行骑水牛；人在桥上走，桥流水不流");
        eopReq.putSecuret4KeyValue("sheli", "诸法因缘生，缘谢法还灭。吾师大沙门，常作如是说。");
        eopReq.putSecuret4KeyValue("shansu", "作福不作恶，皆由宿行法，终不畏死经，如船截流渡。");
        eopReq.setApptx("众因缘生法，我说即是空，亦为是假名，亦是中道义。");

        EopRsp eopRsp = client.execute(eopReq);

        Assert.assertTrue(eopRsp.isSuccess());

    }

    //@Test
    public void testAppQueryHashMap() throws ApiException, InterruptedException {
        EopReq eopReq = new EopReq("admin.app.query");
        eopReq.put("appid", "9000");

        // 第二种方式，传HashMap
        HashMap hashMap = new HashMap();
        hashMap.put("p1", "bingoo");
        hashMap.put("p2", 8);
        eopReq.put("card", hashMap);
        eopReq.setApptx("testAppQueryHashMap");

        TimeUnit.SECONDS.sleep(3);
        EopRsp eopRsp = client.execute(eopReq);

        Assert.assertTrue(eopRsp.isSuccess());
    }

    //@Test
    public void testAppQueryPOJO() throws ApiException, InterruptedException {
        EopReq eopReq = new EopReq("admin.app.query");
        eopReq.put("appid", "9000");

        // 第三种方式，传一个POJO对象（普通JAVA BEAN对象）
        DemoBean demoBean = new DemoBean();
        demoBean.setP1("bingoo");
        demoBean.setP2(8);
        eopReq.put("card", demoBean);
        eopReq.setApptx("testAppQueryPOJO");
        TimeUnit.SECONDS.sleep(3);
        EopRsp eopRsp = client.execute(eopReq);

        Assert.assertTrue(eopRsp.isSuccess());
    }

    //@Test
    public void testAppQueryNestedPOJO() throws ApiException, InterruptedException {
        EopReq eopReq = new EopReq("admin.app.query");
        eopReq.put("appid", "9000");

        // 第三种方式，传一个POJO对象（普通JAVA BEAN对象）
        DemoBean2 demoBean = new DemoBean2();
        demoBean.setP1("bingoo");
        Person person = new Person();
        demoBean.setP2(person);
        person.setName("王磊");
        person.setSex("男");
        eopReq.put("complex", demoBean);

        eopReq.setApptx("testAppQueryNestedPOJO");
        TimeUnit.SECONDS.sleep(3);
        EopRsp eopRsp = client.execute(eopReq);
        System.out.println(eopRsp);

        Assert.assertTrue(eopRsp.isSuccess());
    }

    //@Test
    public void testEssEjb() throws ApiException {
        EopReq eopReq = new EopReq("GetDataReq");
        HashMap param = new HashMap();
        param.put("BIPVer", "0100");
        param.put("ActionCode", "0");
        param.put("SvcContVer", "0100");
        param.put("ProcessTime", "20120105194208");
        param.put("TestIp", "132.35.81.196:8003");
        param.put("ActivityCode", "T3M00006");
        param.put("TestFlag", "0");
        param.put("OrigDomain", "MALL");
        param.put("TransIDO", "3812010512000002");
        param.put("HomeDomain", "UESS");

        Map map = new HashMap();
        map.put("UserType", "01");
        map.put("OperatorID", "000088");
        map.put("ProcId", "");
        map.put("NumID", "13122222222");
        map.put("OldICCID", "");
        map.put("ActiveId", "");
        map.put("Province", "1");
        map.put("City", "1");
        map.put("ICCID", "89860111111111111111");
        map.put("BusiType", "32");
        map.put("AccessType", "01");
        map.put("District", "1");
        map.put("ChannelID", "10111");
        map.put("ReDoTag", "1");
        map.put("CardType", "04");
        map.put("ChannelType", "1010200");
        map.put("ReasonID", "");
        map.put("ErrorComments", "");
        Map body = new HashMap();
        body.put("GetDataReq", map);
        param.put("SvcCont", body);

        Map rout = new HashMap();
        rout.put("RouteType", "00");
        rout.put("RouteValue", "1");
        param.put("Routing", rout);

        eopReq.put("Province", "34");
        eopReq.put("ReqParam", param);
        EopRsp eopRsp = client.execute(eopReq);
        System.out.println(eopRsp.getResult());
        Assert.assertTrue(eopRsp.isSuccess());
    }

    //@Test
    public void testDataBean() throws ApiException {
        CheckResReq reqBean = new CheckResReq();
        // 报文头
        ReqHeadBean reqHead = new ReqHeadBean();
        reqHead.setActionCode("0");
        reqHead.setActivityCode("T3M00004");
        reqHead.setbIPVer("0100");
        reqHead.setHomeDomain("UESS");
        reqHead.setOrigDomain("MALL");
        reqHead.setProcessTime("20120110130306");
        reqHead.setSvcContVer("0100");
        reqHead.setTestFlag("0");
        reqHead.setTransIDO("5512011012000002");
        RoutingBean routBean = new RoutingBean();
        routBean.setRouteType("00");
        routBean.setRouteValue("11");
        reqHead.setRouting(routBean);
        reqBean.setReqHead(reqHead); //

        // 报文体
        CheckResReqBody body = new CheckResReqBody();
        // 员工信息
        OperBean operBean = new OperBean();
        operBean.setOperatorID("000088");
        operBean.setProvince("34");
        operBean.setCity("340");
        operBean.setDistrict("34A");
        operBean.setChannelID("Z0025");
        operBean.setChannelType("1010200");
        operBean.setAccessType("01");
        body.setOper(operBean);
        // 资源信息列表
        ResourcesInfoBean resBean = new ResourcesInfoBean();
        resBean.setResourcesCode("3014337");
        resBean.setResourcesType("03");
        resBean.setOccupiedFlag("1");
        List<ResourcesInfoBean> resList = new ArrayList<ResourcesInfoBean>();
        resList.add(resBean);

        //        resBean = new ResourcesInfoBean();
        //        resBean.setResourcesCode("30143374");
        //        resBean.setResourcesType("03");
        //        resBean.setOccupiedFlag("1");
        //        resBean.setOccupiedTime("4");
        //        resBean.setCertType("4");
        //        resBean.setCertNum("4");
        //        resList.add(resBean);

        body.setResourcesInfo(resList);
        // Para
        List<ParaBean> para = new ArrayList<ParaBean>();
        body.setPara(para);
        reqBean.setReqBody(body); //

        reqBean.setProvince("34"); //
        CheckResRsp rspBean = client.execute(reqBean);
        System.out.println(rspBean);
    }

    //@Test
    public void testTypeUtils() {
        Type respClass = TypeUtils.getActualType(CheckResReq.class, Req.class);
        Assert.assertEquals(CheckResRsp.class, respClass);
    }

    //@Test
    public void testDownload() throws ApiException {
        EopReq req = new EopReq("admin.demo.downloadfile");
        EopRsp rsp = client.execute(req);
        System.out.println(rsp.getRspmsg());
    }

    //@Test
    public void testRefreshSecurity() throws ApiException {
        String appCode = "850D8D1EBF2D4525A05E58E4A719D009";

        String signKey = "fVJ0p+6e/ZoGAXrpPt5sSdjwjXJYpabzVjDiz5NuErPxJNZi1LMShAVdbigE6nPFmRcyLAx1qtO7QnQd2vQnDA==";

        String signAlgorithm = "hmac";
        String paramKey = "53nb+JV7Mon84Y3XMDglDA==";
        String paramAlgorithm = "aes";
        String format = "json";
        String url = "http://127.0.0.1:7001/phw-eop";
        EopClient client = new EopClient(url, appCode, signKey);
        client.setSignAlgorithm(signAlgorithm);
        client.setParamKey(paramKey);
        client.setParamAlgorithm(paramAlgorithm);
        client.setFormat(format);

        EopReq req = new EopReq("admin.app.security.update");
        client.execute(req);
        //EopRsp rsp = client.execute(req);
        //        Map result = rsp.getResult();
        //        System.out.println(result.get("ParamPubKey"));
        //        System.out.println(result.get("SignPubKey"));
    }

    //@Test
    public void testN6UserFace() throws ApiException {
        QuerySnUserReq req = new QuerySnUserReq();

        QuerySnUserReqBody reqBody = new QuerySnUserReqBody();
        reqBody.setTradeTypeCode("0093");
        reqBody.setServiceClassMode("0000");
        reqBody.setGetMode("101000001000");
        reqBody.setSerialNumber("13066665049");
        req.setReqBody(reqBody);

        req.setProvince("91");

        org.phw.eop.api.bean.fbsbase.fbshead.ReqHeadBean reqHead = new org.phw.eop.api.bean.fbsbase.fbshead.ReqHeadBean();

        reqHead.setActionCode("0");
        reqHead.setActionRelation("0");

        ComBusInfoBean busInfo = new ComBusInfoBean();
        busInfo.setAccessType("01");
        busInfo.setChannelId("5910321");
        busInfo.setChannelType("1010101");
        busInfo.setCityCode("");
        busInfo.setEparchyCode("910");
        busInfo.setOperId("S0060834");
        busInfo.setOrderType("00");
        busInfo.setProvinceCode("91");
        reqHead.setComBusInfo(busInfo);

        reqHead.setMsgReceiver("2400");
        reqHead.setMsgSender("2400");
        reqHead.setOperateName("checkUserInfo");
        reqHead.setOrigDomain("UESS");
        reqHead.setProcessTime("20120911142510");
        reqHead.setProcId("Mall8712091100101980");
        reqHead.setServiceName("UsrSer");

        org.phw.eop.api.bean.fbsbase.fbshead.RoutingBean routing = new org.phw.eop.api.bean.fbsbase.fbshead.RoutingBean();
        routing.setRouteType("00");
        routing.setRouteValue("91");
        reqHead.setRouting(routing);

        SPReserveBean spr = new SPReserveBean();
        spr.setConvId("Mallpsns871209110010138220120911142510980");
        spr.setCutoffday("20120911");
        spr.setHsnduns("2400");
        spr.setOsnduns("2400");
        spr.setTransIDC("Mall201209118712091100101980");
        reqHead.setsPReserve(spr);

        reqHead.setTestFlag("0");
        reqHead.setTransIDO("Mall8712091100101980");

        req.setReqHead(reqHead);

        QuerySnUserRsp rsp = client.execute(req);
        System.out.println(rsp);
    }

}
