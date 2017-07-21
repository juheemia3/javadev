package api;

public class StringTest3 {
	public static void main(String[] args) {
	String str1 = "제이비는 몇 살때부터 자바를 잘했나?";
	String str2 = "제이비는 몇 살때부터 자바를 잘했나?";
	
	//System.out.println(str1.replace("몇 살때", "언제")); //단지 바꿔서 출력했을뿐, 원본 데이터에 변경은 없다. 그러므로 if문의 결과 same
	System.out.println(str1 = str1.replace("몇 살때", "언제")); //이렇게 다시 넣어주면, if문의 결과 different
	
	if (str1 == str2) {
		System.out.println("same");
	} else {
		System.out.println("different");
	}
}
}
