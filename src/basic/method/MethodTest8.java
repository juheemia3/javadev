package basic.method;

public class MethodTest8 {
	public static void main(String[] args) {
		int a = 10;
		testFunction(a); // 값만 전달되는 것 = call by value
		System.out.println(a);
	} //main method a는 이 곳에서만 유효

	private static void testFunction(int a) { //여기는 a 값이 복제되어 들어간 것, main의 int a와는 관련이 없음
		a++;
		System.out.println("Testfunction:"+ a);
	}
}
