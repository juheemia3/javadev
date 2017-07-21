package oop.exam8;

public class Car {

	String company = "테슬라";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		this.model = "전기차";
		this.maxSpeed = 200;
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
