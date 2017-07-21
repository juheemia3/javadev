package oop.exam1;

public class Point2D {
	private int x;
	private int y; //private(encapsulation)을 해주면 해당 class에서만 x, y 사용 가능
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;//this --> 받아온 x, 나 자신을 의미
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public void print() {
			System.out.println("x = " + getX());// or this.getX() 도 가능
			System.out.println("y = " + getY());
		}
	}

	//public class Point2D {
	//int x;
	//int y; 
	//}
