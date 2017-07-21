package oop.exam9;

public class Singleton {
	private static Singleton s = null; ////Singleton만들기! 2) 자기자신을 참조하는 static 변수를 만든다. for sharing
	private Singleton(){}//Singleton만들기! 1) 외부 인스턴스 생성 금지를 위해 생성자를 private으로 만든다.
	
	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}//Singleton만들기! 4)오직 한번만 값을 받는 수식을 만든다. (static으로 만들었기 때문에, 처음 null 이후 singleton 값을 받고나서는 그냥 return으로 돌아가서 계속 자신의 값만 반복!) 
		return s;
	}//Singleton만들기! 3) 공유변수(자기자신-Singleton 참조)s를 리턴하는 getter method(getInstance)생성
	
	
	@Override// 
	public String toString() {
	return "포기하는 그 순간 시합종료다! BY 슬램덩크 감독님";
	}
}

/* if문 사용하지 않는 Singleton 만드는 방법
 * private static Singleton singleton = new Singleton();
 * 
 *  private Singleton() {}
 *  
 *  static Singleton getInstance() { //getInstance는 singleton 만들 때 명명을 이렇게 하는 거!(보편 약속?)
 *  	return singleton;
 *  	}
 */	
