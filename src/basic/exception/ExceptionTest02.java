package basic.exception;
//강사님 소스 복붙
public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			throwException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

	private static void throwException() throws Exception {
			
			String str = null;
			System.out.println(str.toString());
			System.out.println("throwException 종료");
	}
}