package basic.exam2;

public class ForTest {
public static void main(String[] args) {
	for (int i=1; i <= 10; i ++) {
		System.out.println(i*10 + ": 사과");
	}
	System.out.println("종료");
}
}

/*//basic version
    for (int i =1; i<=10; i ++) {
       System.out.println("사과");
       }
    System.out.println("종료");
   }
   }
   */

/* for 문에 변수 2개 들어가는 것도 가능
 * for(int i=1,j=1; i <=10; i++_ {
 * System.out.println(i*10 + "," + j + ":사과);
 * }
 *  */