package com.onlineeducation.config;

import lombok.Data;

/**
 * 自定义返回
 * 实现RESTful风格编程规范
 *
 * @param <T>
 */
@Data
public class MyResponse<T> {
    //返回编码值
    private int code;
    //返回是否成功标志
    private Boolean flag;
    //返回内容
    private String message;
    //返回数据
    private T data;

    //空构造方法
    public MyResponse() {
    }

    //自定义所有参数
    public MyResponse<T> normal(Boolean flag, int code, T data, String message) {
        this.flag = flag;
        this.code = code;
        this.data = data;
        this.message = message;
        return this;
    }

    //返回成功 参数：无
    public MyResponse<T> success() {
        this.flag = true;
        this.code = 200;
        this.data = null;
        this.message = "成功";
        return this;
    }

    //返回成功 参数：code,data,message
    public MyResponse<T> success(int code, T data, String message) {
        this.flag = true;
        this.code = code;
        this.data = data;
        this.message = message;
        return this;
    }

    //返回失败 参数：无
    public MyResponse<T> fail() {
        this.flag = false;
        this.code = 500;
        this.data = null;
        this.message = "失败";
        return this;
    }

    //返回失败 参数：code,data,message
    public MyResponse<T> fail(int code, T data, String message) {
        this.flag = true;
        this.code = code;
        this.data = data;
        this.message = message;
        return this;
    }

}
