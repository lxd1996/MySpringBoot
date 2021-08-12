package com.webch1.controller;

import com.webch1.model.User;
import com.webch1.util.ElasticSearchUtil;
import com.webch1.util.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilterBuilder;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SourceFilter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author lxd
 * @Date 2021/8/7 22:23
 **/
@RestController
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @Autowired
    private ElasticsearchRestTemplate es;

    @Autowired
    private JdbcTemplate jdbc;

    @PostMapping("save")
    public ResponseResult saveLogin(@RequestBody User user){
        Map<Long,User> userMap = new HashMap<>();
        userMap.put(user.getId(),user);
        log.info(user.toString());
        return ResponseResult.sendSuccess(user);
    }

    @GetMapping("user/{id}")
    public ResponseResult getUser(@PathVariable Long id){
        User user = new User(id,"xiaoho","qwerty");
        log.info("获取用户成功");
        return ResponseResult.sendSuccess(user);
    }

    @DeleteMapping("user/{id}")
    public ResponseResult deleteByid(@PathVariable Long id){
        User user = new User(id,"许爱华","qwerty");
        log.info("删除用户了");
        System.out.println("打印jsbc的值"+jdbc);
        sesarch();
        return ResponseResult.sendSuccess(user);
    }


    public void sesarch(){
        NativeSearchQuery build = new NativeSearchQueryBuilder().withQuery(QueryBuilders.queryStringQuery("测试").defaultField("title"))
                .withPageable(Pageable.ofSize(10))
                .build();
        SearchHits<Object> search = es.search(build, Object.class);
        System.out.println(search);
        Map<String, Object> stringObjectMap = jdbc.queryForMap("select * from teacher");
        System.out.println(stringObjectMap);



    }

}
