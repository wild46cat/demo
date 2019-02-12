package com.example.demo.WeChatDemo;

import com.google.common.base.Optional;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.ByteArrayRequestEntity;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.lang.StringUtils;
import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStore;
import java.security.SecureRandom;


/**
 * Created by guohang.bao on 14/11/10.
 */
public class HttpUtils {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class.getSimpleName());

    public static final String APPLICATION_JSON = "application/json";


    public static Optional<Integer> asIntOption(Optional<String> opt) {
        Optional<Integer> ret;
        if (opt.isPresent()) {
            ret = Optional.of(Integer.parseInt(opt.get()));
        } else {
            ret = Optional.absent();
        }
        return ret;
    }

    public static class ResultInfo {
        private int statusCode;
        private String responseString;
        private long currentTime;

        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }

        public String getResponseString() {
            return responseString;
        }

        public void setResponseString(String responseString) {
            this.responseString = responseString;
        }

        public long getCurrentTime() {
            return currentTime;
        }

        public void setCurrentTime(long currentTime) {
            this.currentTime = currentTime;
        }
    }

    public static String httpGetVal(String url) {
        return httpGetValWithProxy(url, null);
    }

    public static String httpGetValWithProxies(String url, HttpHost... proxies) {
        String result = null;
        if (proxies == null || proxies.length == 0) {
            result = httpGetValWithProxy(url, null);
        } else if (proxies.length == 1) {
            result = httpGetValWithProxy(url, proxies[0]);
        } else {
            for (HttpHost proxy : proxies) {
                result = httpGetValWithProxy(url, proxy);
                if (result == null) {
                    continue;
                } else {
                    break;
                }
            }
        }
        return result;
    }

    public static String httpGetValWithProxy(String url, HttpHost proxy) {
        String rtn = null;
        HttpClient httpClient = new HttpClient();
        httpClient.getParams().setConnectionManagerTimeout(10000);
        httpClient.getHttpConnectionManager().getParams().setSoTimeout(10000);
        httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(10000);
        GetMethod httpGet = new GetMethod(url);
        httpGet.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
        httpGet.getParams().setCookiePolicy(CookiePolicy.IGNORE_COOKIES);
        if (proxy != null) {
            HostConfiguration config = httpClient.getHostConfiguration();
            config.setProxy(proxy.getHostName(), proxy.getPort());
        }
        try {
            httpClient.executeMethod(httpGet);
            rtn = httpGet.getResponseBodyAsString();
        } catch (Exception e) {
            logger.error("httpGetVal err:==>", e);
            rtn = null;
        } finally {
            httpGet.releaseConnection();
            httpClient = null;
        }
        return rtn;
    }

    public static String httpUrlConnectionWithProxy(String requestUrl, String proxyHost, int proxyPort, String data) throws Exception {
        // 实例化密钥库
        KeyStore ks = KeyStore.getInstance("PKCS12");
        String password = "1523634521";
        // 获得密钥库文件流
        InputStream fis = HttpUtils.class.getClassLoader().getResourceAsStream("1523634521_cert.p12");
        // 加载密钥库
        ks.load(fis, password.toCharArray());
        // 关闭密钥库文件流
        fis.close();
        // 实例化密钥库
        KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        // 初始化密钥工厂
        kmf.init(ks, password.toCharArray());
        // 创建SSLContext
        SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
        sslContext.init(kmf.getKeyManagers(), null, new SecureRandom());
        // 获取SSLSocketFactory对象
        SSLSocketFactory ssf = sslContext.getSocketFactory();
        HttpsURLConnection conn;
        URL url =new URL(null, requestUrl, new sun.net.www.protocol.https.Handler());
        if (StringUtils.isNotBlank(proxyHost)) {
            // 创建代理服务器
            InetSocketAddress addr = new InetSocketAddress(proxyHost, proxyPort);
            Proxy proxy = new Proxy(Proxy.Type.HTTP, addr);
            conn = (HttpsURLConnection) url.openConnection(proxy);
        } else {
            conn = (HttpsURLConnection) url.openConnection();
        }
        conn.setSSLSocketFactory(ssf);
        conn.setRequestMethod("GET");
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.connect();
        System.out.println("now code is:" + conn.getResponseCode());
        // 读取服务器端返回的内容
        InputStream is = conn.getInputStream();
        InputStreamReader isr = new InputStreamReader(is, "utf-8");
        BufferedReader br = new BufferedReader(isr);
        StringBuffer buffer = new StringBuffer();
        String line = null;
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }
        return buffer.toString();
    }

    public static String httpPostVal(String url) {
        String rtn = null;
        HttpClient httpClient = new HttpClient();
        PostMethod httpPost = new PostMethod(url);
        httpPost.getParams().setParameter("http.socket.timeout", 20000);
        httpPost.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
        httpPost.getParams().setCookiePolicy(CookiePolicy.IGNORE_COOKIES);
        try {
            httpClient.executeMethod(httpPost);
            rtn = httpPost.getResponseBodyAsString();
        } catch (Exception e) {
            logger.error("httpPostVal err:==>", e);
        } finally {
            httpPost.releaseConnection();
            httpClient = null;
        }
        return rtn;
    }

    public static String httpGetVal(String url, int socketTimeout, int conTimeout) {
        String rtn = null;
        HttpClient httpClient = new HttpClient();
        GetMethod httpGet = new GetMethod(url);
        httpGet.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
        httpGet.getParams().setCookiePolicy(CookiePolicy.IGNORE_COOKIES);
        try {
            httpClient.getParams().setConnectionManagerTimeout(conTimeout);
            httpClient.getHttpConnectionManager().getParams().setSoTimeout(socketTimeout);
            httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(conTimeout);

            httpClient.executeMethod(httpGet);

            rtn = httpGet.getResponseBodyAsString();
        } catch (Exception e) {
            logger.error("httpGetVal url:" + url + "err:==>", e);
        } finally {
            httpGet.releaseConnection();
            httpClient = null;
        }
        return rtn;
    }

    public static String httpGetValWithStatusCheck(String url, int socketTimeout, int conTimeout, String virtualHost) {
        String rtn = null;
        HttpClient httpClient = new HttpClient();
        GetMethod httpGet = new GetMethod(url);
        httpGet.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
        httpGet.getParams().setCookiePolicy(CookiePolicy.IGNORE_COOKIES);

        if (virtualHost != null && virtualHost.isEmpty() == false) {
            httpGet.getParams().setVirtualHost(virtualHost);
        }

        try {
            if (logger.isDebugEnabled()) {
                logger.debug("http get url: " + url);
            }
            httpClient.getParams().setConnectionManagerTimeout(conTimeout);
            httpClient.getHttpConnectionManager().getParams().setSoTimeout(socketTimeout);
            httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(conTimeout);

            httpClient.executeMethod(httpGet);

            if (logger.isDebugEnabled()) {
                logger.debug("http get url response code: " + httpGet.getStatusCode());
            }

            if (httpGet.getStatusCode() == 200) {
                rtn = httpGet.getResponseBodyAsString();
                if (logger.isDebugEnabled()) {
                    logger.debug("http get url response str: " + rtn);
                }
            }
        } catch (Exception e) {
            logger.error("httpGetVal url:" + url + "err:==>", e);
        } finally {
            httpGet.releaseConnection();
            httpClient = null;
        }
        return rtn;
    }


    public static ResultInfo httpPostValWithRequestMsg(String url, int socketTimeout, int conTimeout, String virtualHost, String contentType, String requestMsg) {

        ResultInfo resultInfo = new ResultInfo();

        if (requestMsg != null && requestMsg.isEmpty() == false) {

            HttpClient httpClient = new HttpClient();
            PostMethod httpPost = new PostMethod(url);
            httpPost.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
            httpPost.getParams().setCookiePolicy(CookiePolicy.IGNORE_COOKIES);
            if (virtualHost != null && virtualHost.isEmpty() == false) {
                httpPost.getParams().setVirtualHost(virtualHost);
            }
            RequestEntity entity = new ByteArrayRequestEntity(requestMsg.getBytes(), "UTF-8");
            httpPost.setRequestEntity(entity);

            if (contentType != null && contentType.isEmpty() == false) {
                httpPost.setRequestHeader(HTTP.CONTENT_TYPE, contentType);
            }
            httpPost.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(1, false));
            try {
                if (logger.isDebugEnabled()) {
                    logger.debug("http get url: " + url);
                }
                httpClient.getParams().setConnectionManagerTimeout(conTimeout);
                httpClient.getHttpConnectionManager().getParams().setSoTimeout(socketTimeout);
                httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(conTimeout);
                resultInfo.setStatusCode(httpClient.executeMethod(httpPost));
                if (logger.isDebugEnabled()) {
                    logger.debug("http get url response code: " + httpPost.getStatusCode());
                }
                if (resultInfo.getStatusCode() == HttpStatus.SC_OK) {

                    if (logger.isDebugEnabled()) {
                        logger.debug("httpGet OK:" + url + " requestBody: " + requestMsg);
                    }
                    resultInfo.setResponseString(httpPost.getResponseBodyAsString());
                    resultInfo.setCurrentTime(System.currentTimeMillis());
                    if (logger.isDebugEnabled()) {
                        logger.debug("http get url response str: " + resultInfo.getResponseString());
                    }

                } else {
                    logger.error(String.format("httpPostValWithRequestMsg fail statusCode:%d  url:%s  requestBody:%s", resultInfo.getStatusCode(), url, requestMsg));
                }
            } catch (Exception e) {
                logger.error(String.format("httpPostValWithRequestMsg fail statusCode:%d  url:%s  requestBody:%s  error:", resultInfo.getStatusCode(), url, requestMsg), e);
            } finally {
                httpPost.releaseConnection();
                httpClient = null;
            }
        }
        return resultInfo;
    }


    public static void downloadFile(String urlStr, String filePath) throws Exception {
        int byteRead;
        URL url = new URL(urlStr);
        FileOutputStream fs = null;
        try {
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            fs = new FileOutputStream(filePath);
            byte[] buffer = new byte[1204];
            while ((byteRead = inStream.read(buffer)) != -1) {
                fs.write(buffer, 0, byteRead);
            }
            fs.flush();
        } finally {
            if (fs != null) {
                fs.close();
            }
        }
    }

    public static byte[] downloadToByte(String url) {
        byte[] bytes = null;
        if (StringUtils.isEmpty(url)) {
            logger.info("getByteByUrl url is empty");
            return bytes;
        }
        logger.info(String.format("downloadToByte begin url[%s]", url));
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            in = new URL(url).openStream();
            out = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            bytes = out.toByteArray();
        } catch (Exception e) {
            logger.error(String.format("getByteByUrl error %s", url), e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                logger.error("getByteByUrl close stream error", e);
            }
        }
        logger.info(String.format("success downloadToByte url[%s]", url));
        return bytes;
    }

}