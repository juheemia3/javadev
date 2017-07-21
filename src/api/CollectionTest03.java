package api;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest03 {
	public static void main(String[] args) {
		Map<String, FriendVO> friendMap = new HashMap<String, FriendVO>();
		friendMap.put("최지웅A", new FriendVO("010-1111-2222", 25, 1));
		friendMap.put("최지웅B", new FriendVO("010-1113-4545", 26, 1));
		friendMap.put("오드리", new FriendVO("010-1311-2782", 20, 2));
		friendMap.put("치치", new FriendVO("010-1110-2456", 50, 2));
		friendMap.put("임쑤", new FriendVO("010-1341-8934", 35, 2));
		friendMap.put("진주웅", new FriendVO("010-5641-4978", 25, 1));

		//System.out.println(friendMap.get("최지웅B"));
		for(String key:friendMap.keySet()) {
			FriendVO friendVO = friendMap.get(key);
			System.out.print(key + "'s number is " + friendVO.getPhone());
			System.out.print(" , age is " + friendVO.getAge() + " and");
			System.out.print(" gender is " + friendVO.getGender() +".");
			System.out.println();
		}
	}
}
