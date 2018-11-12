package com.jfeat.crud.base.tips;

/**
 * @author jackyhuang
 * @date 2018/6/7
 */
public class BulkMessage {
    private Integer code;
    private String message;
    private Integer count = 0;

    public BulkMessage() {

    }

    public BulkMessage(Integer code) {
        this.code = code;
    }

    public BulkMessage(Integer code, Integer count, String message) {
        this(code);
        this.count = count;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
