package model;

import java.io.Serializable;

public class Station implements Serializable{
	private String prefecture;
	private String name;
	public Station() {

	}

	public Station(String prefecture, String name) {
		this.prefecture = prefecture;
		this.name = name;
	}

	public String getPrefecture() {
		return prefecture;
	}

	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
