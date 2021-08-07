package com.estest.estest.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ElasticSearchConfig
 * @Description 两个步骤啊，找对象 放到spring中待用
 * @Author lxd
 * @Date 2021/7/23 23:58
 * @Version 1.0
 **/
@Configuration
public class ElasticSearchConfig {
    @Bean
    public RestHighLevelClient restHightLevelClient() {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("127.0.0.1", 9200, "http")));
        return client;
    }

}




















