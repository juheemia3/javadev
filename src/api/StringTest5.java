package api;

public class StringTest5 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("숫자가 없는 세상의 사람들은 약속을 할 때 이렇게 하지");
		System.out.println(str);
		str.replace(4, 6, "없다면");
		System.out.println(str);
		str.insert(12, "모든");
		System.out.println(str);
		str.delete(12, 14);
		System.out.println(str);
		System.out.println(str.reverse());
}
}
