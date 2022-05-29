package servlet;

import model.Health;

public class HealthCheckLogic {
	Health h;
	double height;
	double weight;
	double bmi;
	HealthCheckLogic(Health h){
		this.h=h;
		this.height=h.getHeight();
		this.weight=h.getWeight();
	}
	public String type() {
		String usertype;
		if(calcbmi()<18.6) {
			usertype="やせ";
		}else if(calcbmi()<26) {
			usertype="普通";
		}else {
			usertype="肥満";
		}
		return usertype;
	}
	public double calcbmi(){
		bmi=weight/((height*0.01)*(height*0.01));
		return bmi;
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

}
