package com.example.myspringboot.lxd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author: 刘旭东
 * @date: 2021/7/6
 */
@Entity
@Table(name = "teacher")
@Data
public class Teacher {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    private String address;
}
