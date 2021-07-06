package com.example.myspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author: 刘旭东
 * @date: 2021/7/5
 */
@SpringBootTest
public class MySpringBootTest {

    @Qualifier("redisTemplate")
    @Autowired
    RedisTemplate redis;


    @Test
    public void contextLoads() {
        redis.opsForValue().set("test","test");
        System.out.println(redis.opsForValue().get("test"));
    }
}
