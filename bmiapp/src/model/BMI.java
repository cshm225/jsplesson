package model;

import java.io.Serializable;

public class BMI implements Serializable{
	private double height;
	private double weight;
	private double bmi;
	private String imgPath;
	public BMI() {
	}

	public BMI(double height, double weight, double bmi) {
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.imgPath=imgPath;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}



}
