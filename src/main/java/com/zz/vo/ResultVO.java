package com.zz.vo;

import lombok.Data;

@Data
public class ResultVO<T> {
    private T body;
    private Integer errorCode;
    private String msg;
    private boolean success;
}
