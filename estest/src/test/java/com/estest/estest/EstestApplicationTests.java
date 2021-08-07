package com.estest.estest;

import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class EstestApplicationTests {
    @Autowired
    private RestHighLevelClient client;



    @Test
    void contextLoads() throws IOException {
        //创建缩影
        CreateIndexRequest request = new CreateIndexRequest("liuxudong");
        //执行请求
        CreateIndexResponse createIndexResponse = client.indices().create(request, RequestOptions.DEFAULT);
        System.out.println(createIndexResponse);
    }

    @Test
    void testRedis(){
        long start = System.currentTimeMillis();
        int k = Math.round(66);
        int m = 1;
        for (int i = 1; i < 1000000000; i++) {
            m = m * k * i;
            //System.out.println(m);
        }
        long end = System.currentTimeMillis();
        System.out.println("=============" + (end-start));
    }


}
