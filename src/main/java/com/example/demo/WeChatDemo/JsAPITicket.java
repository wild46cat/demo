package com.example.demo.WeChatDemo;

import org.apache.commons.codec.digest.DigestUtils;

public class JsAPITicket {
    public static void main(String[] args) {
        /**
         *
         */
        System.out.println(123);
        System.out.println(makeSecrectSha1());
    }

    public static String makeSecrectSha1() {
        String noncestr = "Wm3WZYTPz0wzccnW";
        String jsapi_ticket = "sM4AOVdWfPE4DxkXGEs8VMCPGGVi4C3VM0P37wVUCFvkVAy_90u5h9nbSlYy3-Sl-HhTdfl2fzFy1AOcHKP7qg";
        String timestamp = "1414587457";
        String url = "http://mp.weixin.qq.com?params=value";
        String iss = String.format("jsapi_ticket=%s&noncestr=%s&timestamp=%s&url=%s", jsapi_ticket, noncestr, timestamp, url);
        String res = DigestUtils.sha1Hex(iss);
        return res;
    }
}
