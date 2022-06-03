package model;

import java.io.Serializable;

public class Todo implements Serializable{

	private String title;
	private int id;
	private int important;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getImportant() {
		return important;
	}
	public void setImportant(int important) {
		this.important = important;
	}
	public Todo(String title, int important) {
		super();
		this.title = title;
		this.important = important;
	}
	public Todo(String title, int id, int important) {
		super();
		this.title = title;
		this.id = id;
		this.important = important;
	}
	public String getStar() {
		String stars="";
		for(int i=0;i<this.getImportant();i++) {
			stars+="★";
		}
		return stars;
	}

}
