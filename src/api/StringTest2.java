package api;

public class StringTest2 {
	public static void main(String[] args) {
		
		String str1 = "hi";
		String str2 = "hi";
		
		if (str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		String str3 = new String("hi");
		String str4 = new String("hi");
		
		if (str3 == str4) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		if (str3.equals(str4)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
	}
}