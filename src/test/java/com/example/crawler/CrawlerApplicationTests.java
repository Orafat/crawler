package com.example.crawler;

import com.alibaba.fastjson.JSON;
import com.example.crawler.bo.IcdN;
import com.example.crawler.controller.IcdCrawer;
import com.example.crawler.entity.IcdPo;
import com.example.crawler.service.IcdService;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrawlerApplicationTests {
    @Autowired
    IcdService icdService;
    @Autowired
    IcdCrawer icdCrawer;

    @Test
    public void contextLoads() {
    }
    @Test
    public void testCrawler() throws IOException {
        List<IcdN> icdNS = Collections.EMPTY_LIST;
        String treeUrl = "http://code.nhsa.gov.cn:8000/jbzd/public/toStdIcdTreeList.html";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        for (int i = 0; i < 5; i++) {
            if (icdNS.isEmpty()) {
                icdNS = icdCrawer.postIcdn(treeUrl, icdNS, httpClient);
            } else {
                List<IcdN> collect = icdNS.stream().filter(icdN -> Integer.valueOf(icdN.getLevel()).intValue() == (icdCrawer.count - 1)).collect(Collectors.toList());
                icdNS.addAll(icdCrawer.postIcdn(treeUrl, collect, httpClient));
            }

        }
        //System.out.println(icdNS);
        List<IcdPo> icdPoList = new ArrayList<IcdPo>();

        for (IcdN icdn : icdNS
        ) {
            if(icdn!=null){
               // System.out.println(icdn.getClassName().toString());
                IcdPo icdPo = new IcdPo();
                BeanUtils.copyProperties(icdn, icdPo);
                icdPoList.add(icdPo);
            }

        }

        //        icdPoList.add(BeanCopier.create(IcdN.class, IcdPo.class,false)));
     //   System.out.println(icdPoList);
        icdService.saveAll(icdPoList);


        httpClient.close();

    }
    @Test
    public void testGetSixIcd10() throws IOException {

        List<IcdPo> byLevel = icdService.findByLevel(0);

        //System.out.println(byLevel);
        String treeUrl = "http://code.nhsa.gov.cn:8000/jbzd/public/dataWesterSearchDetail.html";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(treeUrl);
        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
        //3.执行请求，获得响应的实例
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        //int  i =0;
        for (IcdPo icdPo : byLevel
        ) {
            ArrayList<IcdPo> icdPos = new ArrayList<>();

            formparams.clear();
            System.out.println("icdId="+icdPo.getIcdId());
            formparams.add(new BasicNameValuePair("icdId", icdPo.getIcdId()));
            UrlEncodedFormEntity entity = null;
            entity = new UrlEncodedFormEntity(formparams, "UTF-8");
            httpPost.setEntity(entity);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                //输出更详细的抓取内容(html格式)
                //System.out.println(EntityUtils.toString(responseEntity,"utf-8"));
                String html = EntityUtils.toString(responseEntity, "utf-8");
                Document document = Jsoup.parse(html);
                Elements elements = document.select("div.els-doc-con-left");
                for (Element element:elements
                     ) {
                    String uuid = UUID.randomUUID().toString();
                   String code= element.select("a.code").text();
                    String name = element.select("span").text();
                    IcdPo icdpo = new IcdPo();
                    icdpo.setIcdId(uuid);
                    icdpo.setIcdCode(code);
                    icdpo.setIcdName(name);
                    icdpo.setIcdPid(icdPo.getIcdId());
                    icdpo.setLevel(6);
                    icdPos.add(icdpo);
                }
                System.out.println(icdPos.size());
                icdService.saveAll(icdPos);
            }
            EntityUtils.consume(entity);
            response.close();
            //break;
        }

    }

}
