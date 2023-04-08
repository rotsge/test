package com.example.test.controller;

public enum Response {
    SUCCESS("200","成功"),
    FAIL("201","失敗");

    private String code;
    private String msg;

    Response(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    Response(String code){
        this.code = code;
        this.msg = "成功";
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
