package model;

import java.io.Serializable;

public class Tform implements Serializable {
	private String name;
	private String address;
	private String otoiawase;
	public Tform() {

	}
	public Tform(String name, String address, String otoiawase) {
		super();
		this.name = name;
		this.address = address;
		this.otoiawase = otoiawase;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOtoiawase() {
		return otoiawase;
	}
	public void setOtoiawase(String otoiawase) {
		this.otoiawase = otoiawase;
	}

}
