package com.zz.exception;

public class ShopOrderCodeNotExistException extends RuntimeException {
    private String id;

    public ShopOrderCodeNotExistException(String id){
        super("order code not exist");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
