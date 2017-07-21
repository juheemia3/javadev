package api;


import java.util.HashMap;
import java.util.Map;

public class CollectionTest02 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("브래드", "010-2222-3333"); //map.put(key, value)
		map.put("조니", "010-2222-3334");
		map.put("리처드", "010-2222-3335");
		map.put("최지웅", "010-2222-3336");
		map.put("디카프리오", "010-2222-3337");
		
		//System.out.println(map.get("최지웅")); //최지웅이라는 key 값에 대한 value값이 return!
		for(String key:map.keySet()) {
			System.out.println(key);
		} //내가 넣은 순서대로 리턴되지 않음. 내부적으로 흩어놓은 순서대로! 
	}
}
