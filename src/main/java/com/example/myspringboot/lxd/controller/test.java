package com.example.myspringboot.lxd.controller;

import com.example.myspringboot.lxd.model.Teacher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: 刘旭东
 * @date: 2021/7/6
 */
public interface test extends CrudRepository<Teacher,Long> {

}
