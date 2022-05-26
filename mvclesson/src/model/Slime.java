package model;

import java.io.Serializable;

public class Slime implements Serializable{
	private int hp;
	private String name;
	public Slime() {
	}
	public Slime(int hp,String name) {
		this.hp=hp;
		this.name=name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

