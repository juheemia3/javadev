package basic.exception;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		String str = null;
		
		// try~catch 단축키: try~catch문 만들고 싶은 예외발생지역 블럭 후 Alt+Shift+z
		try {
	  //try() { : trywithresources 구문.(autoCloseable, finally가 필요없다고 함. 나중에!(6/22시점)	
			System.out.println(str.toString());
			System.out.println(10/0);//NullPointerException 외의 다른 오류 예제(devided by 0이라는 예외가 있다고 함)
			// throw new NullPointerException();
			// Exception - NullPointerException upcasting 가능! (NullPointerException도 catch문의 Exception에 잡힌다!)
		} catch (NullPointerException e) { //upcasting이 가능하지만 NullPointerExceprion만 따로 잡고 싶을 때 make catch again!
										   //다만, catch의 순서가 sub먼저, super 나중에 (b/c 앞에 super-catch가 가면 위에서 미리 다 잡아버림)
										   //catch (NullPointerException e | NumberFormatException e) 도 가능 JAVA 1.7 부터! ( | : or)
			System.out.println("인스턴스 객체 할당이 안됐음 :(");
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { //finally는 예외에 상관없이 무조건 실행하고 싶은 결과를 적는 곳! e.g. JDBC할 때, 자원반납사례
			System.out.println("무조건 수행");
		}
		System.out.println("종료");
	}
}
