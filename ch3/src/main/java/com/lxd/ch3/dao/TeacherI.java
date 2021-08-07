package com.lxd.ch3.dao;

import com.lxd.ch3.model.Ingredient;
import com.lxd.ch3.model.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: 刘旭东
 * @date: 2021/7/6
 */
@Repository
public interface TeacherI extends CrudRepository<Teacher,String> {

    public Teacher findTeacherByNameAndId(String name, String id);
}
