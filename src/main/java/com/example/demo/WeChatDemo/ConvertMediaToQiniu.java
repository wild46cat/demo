package com.example.demo.WeChatDemo;

import org.apache.commons.codec.binary.Base64;

public class ConvertMediaToQiniu {
    public static void main(String[] args) {
        String url = "http://file.api.weixin.qq.com/cgi-bin/media/get?access_token=18_G3VO0uD2t24u7VGKTkZrZOvfKhggDVln23YVm5PzJbi9YOBKaZa63b3-jP6n5BUvi2xvSy6AQYThhlytRbtXddx6-eTaib-wg4ovkQ5BkyYBtlsi-9V-gpenYlQZQRaACAFWX&media_id=wMnhB4GcSm5oo8aIcOYiOImTzKeb0RGo7sUbXKBj1LviL_uJzoCsAbYvS4qvbLr1";
        byte[] content = HttpUtils.downloadToByte(url);
        String b = new String(Base64.encodeBase64(content));
        System.out.println(b);
    }
}
