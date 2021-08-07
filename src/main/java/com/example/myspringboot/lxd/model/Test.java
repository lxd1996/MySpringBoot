package com.example.myspringboot.lxd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author lxd
 * @Date 2021/8/7 13:41
 **/
@NoArgsConstructor
@Data
public class Test {

    @JsonProperty("employees")
    private List<EmployeesDTO> employees;

    @NoArgsConstructor
    @Data
    public static class EmployeesDTO {
        @JsonProperty("firstName")
        private String firstName;
        @JsonProperty("lastName")
        private String lastName;
    }
}
