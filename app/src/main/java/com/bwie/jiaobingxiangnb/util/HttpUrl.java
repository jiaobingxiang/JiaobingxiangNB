package com.bwie.jiaobingxiangnb.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUrl {

    public static String getHttpPost(String mPath){
        String messages = "";
        try {
            URL murl = new URL(mPath);
            HttpURLConnection conn = (HttpURLConnection)murl.openConnection();
            conn.setRequestMethod("Post");
            // 发送POST请求必须设置为true
            conn.setDoOutput(true);
            conn.setDoInput(true);
            //设置连接超时时间和读取超时时间
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(10000);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                messages+=line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return messages;
    }
}
