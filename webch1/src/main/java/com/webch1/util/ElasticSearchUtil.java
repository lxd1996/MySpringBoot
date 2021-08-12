package com.webch1.util;

import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author lxd
 * @Date 2021/8/7 23:47
 **/
@Component
public class ElasticSearchUtil {
    @Autowired
    public ElasticsearchRestTemplate es;

    @Autowired
    public RestHighLevelClient high;

    @Autowired
    public JdbcTemplate jdbc;

    public void sesarch(){
        NativeSearchQuery build = new NativeSearchQueryBuilder().withQuery(QueryBuilders.queryStringQuery("测试").defaultField("title"))
                .withPageable(Pageable.ofSize(10))
                .build();
        //SearchHits<Object> search = es.search(build, Object.class);
        //System.out.println(search);
        Map<String, Object> stringObjectMap = jdbc.queryForMap("select * from teacher");
        System.out.println(stringObjectMap);

    }

}
