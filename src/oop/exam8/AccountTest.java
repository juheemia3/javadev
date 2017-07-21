package oop.exam8;

public class AccountTest {
public static void main(String[] args) {
	System.out.println(Account.money1);// math.random()과 유사. random변수가 static이기 때문에 가능!
	Account a1 = new Account(1000);
	System.out.println("a1.money1 : " + a1.money1);
	System.out.println("a1.money2 : " + a1.money2);
	System.out.println();
	
	Account a2 = new Account(1000);
	System.out.println("a2.money1 : " + a2.money1);
	System.out.println("a2.money2 : " + a2.money2);
	//a1, a2는 각각 다르다. a1안에 있는 money1, money2가 a2랑 이름이 동일하다고 해도, 
	//다른 곳에 저장되어 있는 것.
	System.out.println();
	
	//int money1 변수를 static 으로 만들면, 
	//: money1 변수는 static area에 계속 저장되어 누적.(return 값:2000)

	Account a3 = new Account(1000);
	System.out.println("a3.money1 : " + a3.money1);
	System.out.println("a3.money2 : " + a3.money2);
	System.out.println();
	
	}
}
