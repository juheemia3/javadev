package oop.exam1;

import oop.exam1.Point3D;

public class PointTest {
	public static void main(String[] args) {
		//new Point2D(); 메모리에 instance생성(실체를 생성한다) + 아직 사용은 불가(이름을 모르는 상태)
		Point3D pt = new Point3D();// 인스턴스명, 인스턴스참조변수 + 사용가능 e.g. pt.x = 100;
			                       // Point3D가 extends Point2D 했다면, Point2D pt = new Point2D(); 자리에 
								   // Point3D pt = new Point3D(); 를 넣어 Point2D 처럼 적용하는 것도 가능
		pt.setX(100);
		pt.setY(200);
		pt.setZ(300);
		pt.print(); //superclass인 Print2D에서 print 함수가 정의되어 있는 부분만 return(= x, y만 리턴!)
	}
}


//public class PointTest {
//	public static void main(String[] args) {
//		//new Point2D(); 메모리에 instance생성(실체를 생성한다) + 아직 사용은 불가(이름을 모르는 상태)
//		Point2D pt = new Point2D();// 인스턴스명, 인스턴스참조변수 + 사용가능 e.g. pt.x = 100;
							       // 여기서는 이름을 pt, 라고 저장했지만 Point2D는 이 사실을 알지 못 함.
//		pt.x(100);
//		pt.y(200);
//		
//		System.out.println("x = " + pt.x);
//		System.out.println("y = " + pt.y);
//	}
//}