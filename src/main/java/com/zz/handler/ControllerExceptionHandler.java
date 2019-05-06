package com.zz.handler;

import com.zz.exception.ShopOrderCodeNotExistException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerExceptionHandler {
   //返回json的错误信息
    @ExceptionHandler(ShopOrderCodeNotExistException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handleShopOrderCodeNotExistException(ShopOrderCodeNotExistException e) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", e.getId());
        map.put("message", e.getMessage());
        return map;
    }

//    @ExceptionHandler(ShopOrderCodeNotExistException.class)
//    public String handle1(ShopOrderCodeNotExistException e) {
//        System.out.println("handle1 500*到了**************");
//        return "/error.html";
//    }
}
