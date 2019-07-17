package com.example.crawler.controller;


import com.alibaba.fastjson.JSON;
import com.example.crawler.bo.IcdN;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class IcdCrawer {
    public static int count =0;

    public  List<IcdN> postIcdn(String url, List<IcdN> icdNs, CloseableHttpClient httpClient) throws IOException {

        count++;
        //2.创建一个HTTP POST请求的HttpPost实例
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
        //3.执行请求，获得响应的实例
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        List<IcdN> list = Collections.EMPTY_LIST;
        List<IcdN> nList= Collections.EMPTY_LIST;
        //4递归调用
        if(icdNs.size()>0  || count > 1) {
            // System.out.println(icdNS);
            for (IcdN icdn : icdNs
            ) {
                formparams.clear();
              System.out.println("icdId="+icdn.getIcdId());
                formparams.add(new BasicNameValuePair("icdId", icdn.getIcdId()));
                UrlEncodedFormEntity entity = null;
                entity = new UrlEncodedFormEntity(formparams, "UTF-8");
                httpPost.setEntity(entity);
                CloseableHttpResponse response = httpClient.execute(httpPost);
                if(list.isEmpty()){
                    list=JSON.parseArray(EntityUtils.toString(response.getEntity()), IcdN.class);
               //     System.out.println(list);
                }else{
                    nList = JSON.parseArray(EntityUtils.toString(response.getEntity()), IcdN.class);
                    list.addAll( nList);
                }
/*                HttpEntity entity1 = response.getEntity();
                String s = EntityUtils.toString(entity1);
                List<IcdN> list1 =JSON.parseArray(s,IcdN.class);*/


                response.close();
            }

        }else{
            formparams.add(new BasicNameValuePair("icdId","" ));
            UrlEncodedFormEntity entity = null;
            entity = new UrlEncodedFormEntity(formparams, "UTF-8");
            httpPost.setEntity(entity);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            list = JSON.parseArray(EntityUtils.toString(response.getEntity()), IcdN.class);
            response.close();
        }

        return list;
    }
}