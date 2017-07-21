package basic.exam2;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		String[] choice = {"가위", "바위", "보"};
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("가위는 1, 바위는 2, 보는 3을 입력하세요 >");
	 int you = sc.nextInt();
	 int com = (int)(Math.random() *3) +1;
	 
	 System.out.println("You : " + choice[you - 1]);
	 System.out.println("Com : " + choice[com - 1]);
	 
	 if(com == 1) {
		 if(you == 1) {
			 System.out.println("무승부");
		 } else if(you ==2){
			 System.out.println("인간의 승리");
		 } else if(you ==3){
			 System.out.println("컴퓨터의 승리");
		 }
		 
	} else if(com ==2) {
		 if(you == 2) {
			 System.out.println("무승부");
		 } else if(you == 1){
			 System.out.println("컴퓨터의 승리");
		 } else if(you == 3){
			 System.out.println("인간의 승리");
		 }
		 
	} else if(com ==3) {
		if(you ==3) {
			System.out.println("무승부");
		} else if(you == 1){
			System.out.println("인간의 승리");
		} else if(you ==2){
			System.out.println("컴퓨터의 승리");
		}
		
	}
	
}
}


/* package basic.exam;
import java.util.Scanner;

public class SwitchTest튜터님 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
      int n = s.nextInt();

      int c = (int) Math.random() * 3 + 1;
      String[] rsp = { "가위", "바위", "보" };
      System.out.println("you : " + rsp[n - 1]);
      System.out.println("com : " + rsp[c - 1]);
      String[] result = { "무승부", "당신의 승리", "컴퓨터의 승리" };
      switch (c) {
      case 1:
         switch (n) {
         case 1:
            System.out.print(result[0]);
            break;
         case 2:
            System.out.print(result[1]);
            break;
         case 3:
            System.out.print(result[2]);
            break;
         }
         break;
      case 2:
         switch (n) {
         case 1:
            System.out.print(result[2]);
            break;
         case 2:
            System.out.print(result[0]);
            break;
         case 3:
            System.out.print(result[1]);
            break;
         }
         break;
      case 3:
         switch (n) {
         case 1:
            System.out.print(result[1]);
            break;
         case 2:
            System.out.print(result[2]);
            break;
         case 3:
            System.out.print(result[0]);
            break;
         }
         break;
*/

/*
package basic.exam2;

import java.util.Scanner;

public class Game보영보영 {
   public static void main(String[] args) {
      String[] caption = {"가위","바위","보"};
      System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요>>");
      Scanner sc = new Scanner(System.in);

      int me = sc.nextInt();
      System.out.println("you : " + caption[me-1]);

      int com = (int) (Math.random() * 3) + 1;
      System.out.println("com : " + caption[com-1]);

      int result = me - com;

      switch (result) {
      case 1:
      case -2:
         System.out.println("당신의 승리");
         break;
      case 0:
         System.out.println("무승부");
         break;
      case -1:
      case 2:
         System.out.println("컴퓨터의 승리");
         break;
      default:
         System.out.println("에러");
         break;
      }
      sc.close();
   }
}
*/

/*

강사님

if ((you == 1 && com == 3)||
    (you == 2 && com == 1)||
    (you == 3 && com == 2)) {
    System.out.println("당신의 승리");
    }
    
*/