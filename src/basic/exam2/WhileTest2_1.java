package basic.exam2;

public class WhileTest2_1 {
public static void main(String[] args) {

int i = 0;
int sum = 0;

while(i <=1000) {
	sum = sum + i;
	i +=3;
}
System.out.println(sum);
}
}	


/*
 int sum = 0;
 int count = 3;
 while(count <= 1000) {
      sum += count;
      count += 3; //증감은 언제나 루프의 마지막, 아니면 답이 다르게 나올 수도
      }
      System.out.println(sum)
      }
 */
	
	
/*		int i = 1;
		while(i <= 10) {
			 System.out.println(i*10 + ": 사과");
			 i++;
		 }
		 System.out.println("종료")
}
}
	*/