package oop.exam7;

public class Point2D {
	int x;
	int y;
		
/*	public Point2D(){}; //기본생성자, default constructor: 파라미터가 없는 생성자
			            //변형생성자를 만들더라도, 기본생성자는 만드는 것이 좋다..?
*/	
	public Point2D(){
		this(1,1); //RULE: constructor call(생성자호출) must be the first statement in a constructor
			       //Point2D(int x, int y)에 내려가서 수행하는 것.
		System.out.println("Point2D()");
		
		
	} //생성자 overload: pt1에서 x,y값의 기본을 '0'으로 주고 싶을 때.
	
	
	public Point2D(int x, int y) {
		super(); // Point2D 가 상속받은 다른 class가 있을 때, 그 class로 가서 그 함수를 시행.
				 // 없어도 됨! 1) 없어도 superclass로 가서 실행함, 
		         //            2) 이 경우 상속받은 다른 class: object가 별다른 내용이 없음.
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y)");
	}
	
}