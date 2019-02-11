package com.example.demo.WeChatDemo;


import org.apache.commons.httpclient.HttpHost;


public class HttpProxyTest {

    public static void main1(String[] args) throws Exception {
        String url = "http://www.wuxueyou.cn";
        String s = HttpUtils.httpUrlConnectionWithProxy(url, "10.10.30.17", 3128,"aabbccdd");
        System.out.println(123);
        System.out.println(s);
    }

    public static void main(String[] args) throws Exception {
        String url = "http://bbsadmintest.j.cn";
        String s = HttpUtils.httpGetValWithProxies(url, new HttpHost("10.10.30.17", 3128));
        System.out.println(s);
    }

    private static void locationServerTest() {
        String bbb = "\\u9e64\\u5c97\\u5e02";
        String b = UicodeBackslashU.unicodeToCn(bbb);
        System.out.println(b);
        String res = "";
        String longtitude = "130.674534";
        String latitude = "47.448043";
        String requestMsg = String.format("{\n" +
                "\t\"locationList\":[\"192.168.1.1,,,%s,%s\"]\n" +
                "}", longtitude, latitude);
        HttpUtils.ResultInfo resultInfo = HttpUtils.httpPostValWithRequestMsg("http://natha-new.paas.jcndev.com/api/fetchAddresses",
                2000, 2000, null, "application/json", requestMsg);
        if (resultInfo.getStatusCode() == 200) {
            res = resultInfo.getResponseString();
        }
        System.out.println(resultInfo.getResponseString());
    }
}
