package com.webch1.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author lxd
 * @Date 2021/8/7 22:25
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult {
    private int code;
    private String message;
    private Object data;

    public static ResponseResult sendSuccess(Object obj){
        return ResponseResult.builder().code(200).message("成功").data(obj).build();
    }

    public static ResponseResult sendSuccess(){
        return ResponseResult.builder().code(200).message("成功").data(null).build();
    }
}
