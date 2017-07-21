package oop.exam4;

public class Animal {
	@Override// superclass가 없는데도 override가능. java의 모든 class는 object를 superclass로 가지고 있어서..?
	public String toString() {
		return "Animal 입니다.";
	}
	
}
