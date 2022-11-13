package com.banana.bananaservice.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {
    private Boolean success;
    private String code;
    private String message;
    private T data;

    public Result success(String message,T t){
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setCode("0000");
        result.setMessage(message);
        result.setData(t);
        return result;
    }
}
