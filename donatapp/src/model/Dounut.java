package model;

import java.io.Serializable;

public class Dounut implements Serializable {
	private int id;
	private String name;
	private int price;
	private String imgname;
	public Dounut(int id, String name, int price, String imgname) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgname = imgname;
	}
	public Dounut(String name, int price, String imgname) {
		super();
		this.name = name;
		this.price = price;
		this.imgname = imgname;
	}
	public Dounut() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}

}
