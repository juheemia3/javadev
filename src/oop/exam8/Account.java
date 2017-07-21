package oop.exam8;

/*public class Account {
	int money1;
	int money2;
	
	public Account(int money){ //생성자 만들기
		money1 += money;
		money2 += money;
	}
}
*/

//static 붙인 후

public class Account {
	static int money1;
	int money2;
	
	public Account(int money){ //생성자 만들기
		money1 += money;
		money2 += money;
	}
}
