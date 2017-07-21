package basic.exam3;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도: ");int year = sc.nextInt();
		System.out.println("월: ");int month = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1); 
//		1월이 0으로 저장되니, -1을 해줘야하는 것 기억
		int week = c.get(Calendar.DAY_OF_WEEK);
//		시작일이 무슨 요일인지 들어있음. 첫 날이 언제 시작하는지! 달력을 만드는데 필요한 요소1
		int end_day = c.getActualMaximum(Calendar.DATE);
//		필요한 요소2
		
		System.out.println(year+ "년" + month + "월");
		System.out.println("--------------------");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		
		for(int d=1; d < week; d++ ) {
			System.out.print("   "); 
		}
//		1일 시작 전까지, 공백을 찍어주는 for문
		for(int d=1, w=week; d <= end_day; d++, w++) {
			System.out.print(d < 10 ? " " + d +" " : d + " " );
			if (w % 7 == 0) System.out.println();
		}
	}
	}