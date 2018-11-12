package com.jfeat.crud.base.tips;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackyhuang
 * @date 2018/6/7
 */
public class BulkResult {
    private BulkMessage success;
    private List<BulkMessage> failure;

    public BulkMessage getSuccess() {
        return success;
    }

    public void setSuccess(BulkMessage success) {
        this.success = success;
    }

    public List<BulkMessage> getFailure() {
        return failure;
    }

    public void setFailure(List<BulkMessage> failure) {
        this.failure = failure;
    }

    public BulkResult() {

    }

    public BulkResult(BulkMessage success) {
        this.success = success;
    }

    public BulkResult(BulkMessage success, List<BulkMessage> failure) {
        this(success);
        this.failure = failure;
    }

    public BulkResult(BulkMessage success, BulkMessage failure) {
        this(success);
        if (failure != null) {
            List<BulkMessage> list = new ArrayList<>();
            list.add(failure);
            this.failure = list;
        }
    }
}
