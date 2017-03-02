package com.twx.po;

import java.util.Arrays;

public class BaiduTranslate {
	
	private String from;
	private String to;
	private TranResult[] trans_result;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	@Override
	public String toString() {
		return "BaiduTranslate [from=" + from + ", to=" + to
				+ ", trans_result=" + Arrays.toString(trans_result) + "]";
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public TranResult[] getTrans_result() {
		return trans_result;
	}
	public void setTrans_result(TranResult[] trans_result) {
		this.trans_result = trans_result;
	}

}
