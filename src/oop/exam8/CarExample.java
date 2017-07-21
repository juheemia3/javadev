package oop.exam8;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1 제조사 : " + car1.company);
		System.out.println("실험) car1 모델: " + car1.model);
		System.out.println();
	
		Car car2 = new Car("자가용");
		System.out.println("car2 제조사 : " + car2.company);
		System.out.println("car2 모델: " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "노랑");
		System.out.println("car3 제조사 :" + car3.company);
		System.out.println("car3 모델 :" + car3.model);
		System.out.println("car3 색상 :" + car3.color);
		System.out.println();

		Car car3_1 = new Car("자가용", "노랑");
		System.out.println("car3 제조사 :" + car3_1.company);
		System.out.println("car3 모델 :" + car1.model);
		System.out.println("car3 색상 :" + car3_1.color);
		System.out.println("car3 최대속력 :" + car1.maxSpeed);
		System.out.println();
		
		Car car4 = new Car("자가용", "노랑", 600);
		System.out.println("car4 제조사 : " + car4.company);
		System.out.println("car4 모델 : " + car4.model);
		System.out.println("car4 색상 : " + car4.color);
		System.out.println("car4 최대속력 : " + car4.maxSpeed);
	}
		
		
}
