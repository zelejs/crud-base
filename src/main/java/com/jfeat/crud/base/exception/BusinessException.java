package com.jfeat.crud.base.exception;

/**
 * @author Admin
 * @Description 业务异常的封装
 * @date 2016年11月12日 下午5:05:10
 */
@SuppressWarnings("serial")
public class BusinessException extends RuntimeException {

    public static final int BusinessCodeBase = 4000;

    //友好提示的code码
    private int friendlyCode;

    //友好提示
    private String friendlyMsg;

    public BusinessException(BusinessCode businessCode) {
        this.friendlyCode = businessCode.getCode();
        this.friendlyMsg = businessCode.getMessage();
    }

    public BusinessException(BusinessCode businessCode, String message) {
        this.friendlyCode = businessCode.getCode();
        this.friendlyMsg = message;
    }

    public BusinessException(int code, String message) {
        this.friendlyCode = code;
        this.friendlyMsg = message;
    }

    public int getCode() {
        return friendlyCode;
    }

    public void setCode(int code) {
        this.friendlyCode = code;
    }

    @Override
    public String getMessage() {
        return friendlyMsg;
    }

    public void setMessage(String message) {
        this.friendlyMsg = message;
    }

}
