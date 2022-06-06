package model;

import java.io.Serializable;

public class Todo implements Serializable{
	private int id;
	private String title;
	private int important;

	public Todo() {

	}
	public Todo(String title,int important) {
		this.title=title;
		this.important=important;

	}
	public Todo(int id,String title,int important) {
		this(title,important);
		this.important=important;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getImportant() {
		return important;
	}
	public void setImportant(int important) {
		this.important = important;
	}
	public String getStar() {
		String stars="";
		for(int i=0;i<this.important;i++) {
			stars+="★";
		}
		return stars;
	}

}
