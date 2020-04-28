package com.cw.copywriting.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Response<T> {
    private final Integer code;
    private final String msg;
    private final T data;


    private Response(T data2) {
        this(200, "success", data2);
    }


    public static <T> Response<T> of(T data) {
        return new Response<>(data);
    }

    public static <T> Response<T> of(Integer code,String msg) {
        return new Response<>(code,msg,null);
    }

    public static <T> Response<T> of(Integer code,String msg,T data) {
        return new Response<>(code,msg,data);
    }

    public static <T>Response<T> success(){
        return new Response<>(null);
    }
    public static <T>Response<T> fail(String msg){
        return new Response<>(0, msg,null);
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}