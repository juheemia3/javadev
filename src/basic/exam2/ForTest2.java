package basic.exam2;

public class ForTest2 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i =1; i <= 1000; i++) { //1000번 돌아감, i가 1부터 시작해야하는 것 유념
			if(i%3 == 0){ //3으로 나눈 나머지가 0
				sum += i;
			}
		}
		System.out.println(sum);
	}
}

		
/* 답변 2
 int sum = 0;
 
 for(int i = 0; i<=1000; i+=3) { //333번 돌아감, 더 효율은 좋다!
     sum += i;
  }
  System.out.println(sum);
 }
 */
		
		
/* 내답변 int sum = 0;
		
		for(int i=1; i <= 333; i++) {
		sum += i; 
	}
		System.out.println(sum*3);
	}
}

*/
   
/*//basic: 1부터 3까지 정수의 합
		int sum = 0;
		
		for (int i = 1; i <= 3; i++) {
			sum += i;
		}
		System.out.println(sum);
}
}
*/
