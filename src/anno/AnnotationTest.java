package anno;
// 대표적인 annotation들!
//@Override //상위 클래스에 동일한 내용의 method가 존재해야함!
//@Deprecated//API의 사용을 더이상 권장하지 않는다. e.g. 새롭고 좋은 api가 나와서 그것으로 대체.
//@SuppressWarnings//메모리가 누수될 확률이 높아. 이거 꼭 사용해야해? 

import java.util.List;

public class AnnotationTest {
	
	@SafeVarargs
	public AnnotationTest(List<String>... list) { //생성자 생성, collection framework(List<String>)를 매개변수로 받는다.
											      //...: list, 즉 많은 배열이 들어감. Potential heap pollution via varargs parameter list error. 해결을 위해 @SafeVarargs = 내가 확인해봤는데 괜찮아!
		
	}
	
	@SafeVarargs
	public static String test(List<String>...list) {
		return null;
	}
}
