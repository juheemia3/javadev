package api;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //arraylist upcasting 하여 사용
		list.add("조지 클루니");printStr(list);
		list.add("네스프레소");printStr(list);
		list.add("디카프리오");printStr(list);
		list.add("최지웅");printStr(list);
		
		
		}

	private static void printStr(List<String> list) {
		for(String name : list) {
			System.out.print(name + "\t");
		} System.out.println();
	}

/*	private static void printStr(List list) {
		for(int i=0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		
	}
	System.out.println();
}*/
}
