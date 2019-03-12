package com.jfeat.crud.base.tips;

/**
 * 返回给前台的成功提示
 *
 * @author Admin
 * @date 2016年11月12日 下午5:05:22
 */
public class SuccessTip extends Tip {

	private Object data;

	public Object getData() {
		return data;
	}

	public SuccessTip setData(Object data) {
		this.data = data;
		return this;
	}

	public SuccessTip(Object data) {
		this();
		this.data = data;
	}

	public SuccessTip() {
		super.code = 200;
		super.message = "Success";
	}

	public static SuccessTip create() {
		return new SuccessTip();
	}

	public static SuccessTip create(Object data) {
		return new SuccessTip(data);
	}
}
