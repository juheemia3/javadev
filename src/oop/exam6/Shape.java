package oop.exam6;

public class Shape {
	double res;
	public void area() { // area() 함수 뒤에 {}를 없애고, abstract function과 class를 만들게 되면, 상속받은 class에서 area()함수를 만들지 않으면, 에러!
						 // 이런 식으로 하면 다른 식으로 너비를 구하는 공식이 명명되는 것을 방지가능(표준이 지켜짐)
						 // 밑에 주석 확인!
			}
}


/*public abstract class Shape {
	double res;
	public abstract void area();
}*/