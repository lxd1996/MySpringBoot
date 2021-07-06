package com.lxd.ch3;

import com.lxd.ch3.dao.IngredientI;
import com.lxd.ch3.dao.TeacherI;
import com.lxd.ch3.model.Ingredient;
import com.lxd.ch3.model.Ingredient.Type;
import com.lxd.ch3.model.Teacher;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author: 刘旭东
 * @date: 2021/7/6
 */
@SpringBootTest
public class SpringJDBCTest {

    @Autowired
    private JdbcTemplate jdbc;

    @Autowired
    private IngredientI crud;

    @Autowired
    private TeacherI tcrud;



    @Test
    public void test(){
        //Map<String, Object> stringObjectMap = jdbc.queryForMap("select * from Ingredient");
        List<Map<String, Object>> maps = jdbc.queryForList("select * from Ingredient");
        for (Map map: maps) {
            Set<String> set = map.keySet();
            for (String str: set) {
                System.out.println(map.get(str));
            }
        }

    }
    @Test
    public void test1(){
        Ingredient test = new Ingredient("999", "test", Type.VEGGIES);
        Ingredient save = crud.save(test);
        System.out.println(save);
    }

    @Test
    public void test2(){
        Teacher name = new Teacher("9999", "name", Teacher.Type.CHEESE);
        tcrud.save(name);

    }
    @Test
    public void test3(){
        Iterable<Teacher> allById = tcrud.findAllById(Collections.singleton("9999"));
        for (Teacher t: allById) {
            System.out.println(t.toString());
        }

    }

}
