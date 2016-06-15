package com.jlc.spring;

public class Batch {
	String bid;
	
	String sd;
	
	String timing;
	
	String nos;

	public Batch(String bid, String sd, String timing, String nos) {
		this.bid = bid;
		this.sd = sd;
		this.timing = timing;
		this.nos = nos;
	}

	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", sd=" + sd + ", timing=" + timing
				+ ", nos=" + nos + "]";
	}
	
	
}
