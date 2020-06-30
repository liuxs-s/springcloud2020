package com.cumt.springcloud.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述：统一返回结果
 *
 * @author liuxs_s@163.com
 * @create 2020-06-29 21:48
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {

    private Integer code;

    private String message;

    private T result;

    public R(Integer code, String message) {
        this(code,message,null);
    }
}
