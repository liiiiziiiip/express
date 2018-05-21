package com.buyer.model;

public class Text {
	private String id;
	private String name;
	private String text;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Text [id=" + id + ", name=" + name + ", text=" + text + "]";
	}
	
	

}
