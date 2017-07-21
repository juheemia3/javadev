package basic.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose one int number among 1~99 >");
		int n = -1;
		
		try {
			n = sc.nextInt();
			if (!(1 <= n && n <= 99)) {
				throw new InputMismatchException(); //if ()의 조건을 만족할 경우 InputMismatchException() 발생시킨다.(throw)
			}                                       //RunTimeException is also possible.
			System.out.println("Your number is "+ n);
		} catch (Exception e) {
			System.out.println("error : " + e.getMessage()); //e.getMessage의 내용을 변경하고 싶다면?
		}
	}
}
