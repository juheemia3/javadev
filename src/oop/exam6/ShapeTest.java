package oop.exam6;

public class ShapeTest {
	public static void main(String[] args) {
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());
	}

	private static void printArea(Shape s) {
		s.area();
		if (s instanceof Circle) { //instanceof: Shape이 Circle로 downcasting이 가능한 것인가 확인
			Circle c = (Circle) s;
			System.out.println(
					"반지름이 " + c.r + "인 원의 넓이는 " + c.res);
		} else if (s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.println(
					"너비가 " + r.w + "높이가" + r.h + "인 사각형의 넓이는 " + r.res);
		} else if (s instanceof Triangle) {
			Triangle t = (Triangle) s;
			System.out.println(
					"밑 변의 길이가 " + t.w + "높이가" + t.h + "인 삼각형의 넓이는 " + t.res);
			
		}
	}
}