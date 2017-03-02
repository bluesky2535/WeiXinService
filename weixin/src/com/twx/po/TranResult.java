package com.twx.po;

public class TranResult {

	private String src;
	private String dst;
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDst() {
		return dst;
	}
	@Override
	public String toString() {
		return "TranResult [src=" + src + ", dst=" + dst + "]";
	}
	public void setDst(String dst) {
		this.dst = dst;
	}
}
