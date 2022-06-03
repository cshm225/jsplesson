package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	private int id;
	private String userName;
	private String text;
	public Mutter(String userName, String text,int id) {
		this.userName = userName;
		this.text = text;
		this.id=id;
	}


	public Mutter(String userName, String text) {
		this.userName = userName;
		this.text = text;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Mutter() {

	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}


}
