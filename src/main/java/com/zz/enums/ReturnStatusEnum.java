package com.zz.enums;

import lombok.Getter;

@Getter
public enum ReturnStatusEnum implements CodeEnum{
    SUCCESS(-1,"成功"),
    ERROR(0,"失败");
    private Integer code;
    private String msg;

    ReturnStatusEnum(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }

}
