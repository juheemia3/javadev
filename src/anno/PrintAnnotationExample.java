package anno;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		
		Method[] declareMethods = Service.class.getDeclaredMethods(); //method에 대한 정보를 언어내서 method[]배열에 넣어줌.
		System.out.println("Service 클래스의 메소드 개수 : " + declareMethods.length); //method의 개수 파악
		

 		/*첫번째 테스트
 		 * Service service = new Service();
		service.method1();
		service.method2();
		service.method3();*/
		
		for (Method method : declareMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				for(int i = 1; i <= printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
			}
		}
		
	}
	
	
}
