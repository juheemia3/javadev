package basic.exam2;

public class DoWhileTest {
public static void main(String[] args) {
	int i =1;
	do{ 
		System.out.println("사과");
		i++;
	} while(i <=3);
}
}

/* do while문을 쓰면 편리한 경우
   int i,j
i = (int)(Math.random() * 6) +1;
j = (int)(Marh.random() * 6) +1; // 이 경우 i, j가 1/6의 확률로 동일. 이런 경우를 제하고 싶을 때, do~while이 편리

System.out.println("i = " + i);
System.out.println("j = " + j);
*/

/*
 *  int i,j
i = (int)(Math.random() * 6) +1;
do {
j = (int)(Marh.random() * 6) +1;
} while(j+i);

System.out.println("i = " + i);
System.out.println("j = " + j);

 */
