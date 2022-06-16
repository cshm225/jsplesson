package model;

import java.io.Serializable;

public class Age implements Serializable{
	private int age;
	private int year;
	private int month;
	private int day;
	private int enterhSchool;
	private int graduationhSchool;
	private int enterUnivercity;
	private int gUnivercity;

	public Age() {
	}

	public int getEnterhSchool() {
		return enterhSchool;
	}

	public void setEnterhSchool(int enterhSchool) {
		this.enterhSchool = enterhSchool;
	}

	public int getGraduationhSchool() {
		return graduationhSchool;
	}

	public void setGraduationhSchool(int graduationhSchool) {
		this.graduationhSchool = graduationhSchool;
	}

	public int getEnterUnivercity() {
		return enterUnivercity;
	}

	public void setEnterUnivercity(int enterUnivercity) {
		this.enterUnivercity = enterUnivercity;
	}

	public int getgUnivercity() {
		return gUnivercity;
	}

	public void setgUnivercity(int gUnivercity) {
		this.gUnivercity = gUnivercity;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}


}
