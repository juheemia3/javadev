package anno;

public class Service {

	@PrintAnnotation

	public void method1() {
		System.out.println("실행 내용1");
	}
	@PrintAnnotation("*") // default 가 -이 아닌 *으로 변경
	public void method2() {
		
		System.out.println("실행 내용2");
	}

	@PrintAnnotation(value = "#", number=15) // 두 개를 변경할떄는 value를 꼭 작성해 주어야 한다. 
	public void method3() {
	
	System.out.println("실행 내용3");
}
}
