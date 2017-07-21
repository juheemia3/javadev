package oop.exam9;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1 + ":" + s1.hashCode());//s1의 hashcode가 찍혀나옴!
													//s1, s2는 내용은 같아도, hashcode 주소가 다름! 즉 다른 곳에 현재 동일한 내용만 저장되어있을 뿐
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2 + ":" + s2.hashCode());

	}
}
