package com.jfeat.crud.base.tips;

import com.jfeat.crud.base.exception.BusinessCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回给前台的错误提示
 *
 * @author Admin
 * @date 2016年11月12日 下午5:05:22
 */
public class ErrorTip extends Tip {

    private List<Map<String, String>> errors = new ArrayList<>();

    public ErrorTip add(String field, String error) {
        Map<String, String> map = new HashMap<>();
        map.put(field, error);
        errors.add(map);
        return this;
    }

    public List<Map<String, String>> getErrors() {
        return errors;
    }

    public void setErrors(List<Map<String, String>> errors) {
        this.errors = errors;
    }

    public ErrorTip(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public ErrorTip(BusinessCode businessCode) {
        this.code = businessCode.getCode();
        this.message = businessCode.getMessage();
    }

    public ErrorTip(BusinessCode businessCode, String message) {
        this.code = businessCode.getCode();
        this.message = message;
    }

    public static ErrorTip create(int code, String message) {
        return new ErrorTip(code ,message);
    }

    public static ErrorTip create(BusinessCode businessCode) {
        return new ErrorTip(businessCode);
    }

    public static ErrorTip create(BusinessCode businessCode, String message) {
        return new ErrorTip(businessCode, message);
    }
}
