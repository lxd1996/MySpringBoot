package com.lxd.ch3;

import com.lxd.ch3.model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ch3Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch3Application.class, args);
        Teacher teacher = new Teacher();
    }

}
