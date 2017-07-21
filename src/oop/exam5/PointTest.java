package oop.exam5;

public class PointTest {
	public static void main(String[] args) {
		//Point3D up = new Point3D();
		Point2D up = new Point3D();// upcasting 가능! 
	
		up.x = 100;
		up.y = 200;
		//up.z = 300; --> 불가능 instance에는 z가 있음. but class area(참조 area)의 Point2D에는 z가 없음.
		
		Point3D dn = (Point3D) up;//강제형변환 (int)로 소수점 제외하던 것 처럼!
		//dncasting의 경우 원래 3D정보와 그 위의 2D도 가지고 있음(extends 2D 했으니까)\
		//새로운 정보로 접근하려면 down casting을 해야함 
		dn.x = 1000;
		dn.y = 2000;
		dn.z = 3000;
	
	}
}
