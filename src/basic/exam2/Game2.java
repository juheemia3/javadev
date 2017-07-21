package basic.exam2;

import java.util.Scanner;

public class Game2 {
	public static void main(String[] args) {
		System.out.println("가위(1), 바위(2), 보(3)!");
		
		Scanner sc = new Scanner(System.in);
			
		int human = sc.nextInt();
		int computer = (int)(Math.random()*3) + 1;
		
		String[] choice = {"가위", "바위", "보"};
			
		System.out.println("you : " + choice[human -1]);
		System.out.println("com : " + choice[computer -1]);
		
		int result = human - computer;

		switch(result) {
			case -1:
			case 2:
				System.out.println("컴퓨터 승리");
			break;
			
			case 1:
			case -2:
				System.out.println("인간 승리");
			break;
			
			case 0:
				System.out.println("무승부");
			break;
			
			default:
				System.out.println("에러");
			break;
		}
	}
	}


