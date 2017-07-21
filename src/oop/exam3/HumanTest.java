package oop.exam3;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		
		h.setName("이용빈");
		h.setGender(1);
		h.setYear(1987);
		h.setJob("분석가");
		h.setMarried(false);
		h.setWeight(70);
		h.setHeight(168);
		h.setHobby("서예");
		System.out.println(h);
		
		PetLover pl = new PetLover(); //여기서부터 2차 작업
		
		System.out.println();
		
		pl.setName("튜터님");
		pl.setGender(1);
		pl.setYear(1991);
		pl.setJob("알고리즘 개발자");
		pl.setMarried(false);
		pl.setWeight(70);
		pl.setHeight(180);
		pl.setHobby("테니스");
		pl.setAnimalType("고양이");
		pl.setAyear(2015);
		System.out.println(pl);
		
		
	}
}
