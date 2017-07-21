package api;

public class StringTest4 {
	public static void main(String[] args) {
		String str = "숫자가 없는 세상의 사람들은 약속을 할 때 이렇게 하지.";
		System.out.println(str.charAt(11));
		System.out.println(str.indexOf("은"));
		System.out.println(str.length());
		System.out.println(str.lastIndexOf("은")); //가장 첫 번째 나오는 것, 동시에 나오면 last에 가까운 것 기준
		System.out.println(str.replace("약속", "사랑"));
		System.out.println("World".toLowerCase()); //전부 소문자
		System.out.println("World".toUpperCase()); //전부 대문자
		System.out.println(str.substring(4,7)); //5~7까지 첫 번째 글자가 '0'부터
		System.out.println(str.substring(5)); //5~ 끝까지!

}
}
