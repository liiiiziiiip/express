package com.buyer.model;

import java.util.Date;

public class TimeFormat {
	private String time;

	public String getTime() {
		Date date = new Date();
//		time = String.format("%tY", date) + "-" + String.format("%tm", date) + "-" + String.format("%td", date) + "-" + String.format("%tH", date);
		time = String.format("%tF", date) + " - " + String.format("%tT", date);
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
