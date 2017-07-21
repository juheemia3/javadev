package oop.exam4;

public class AnimalTest {
	public static void main(String[] args) {
/*		Animal animal = new Animal();
		System.out.println(animal);
*/	
	// Subtype의 instance는 supertype으로 참조 가능
	//자동형변환(묵시적형변환) * Up casting(단계는 상관 없음)
		Animal animal = new Bird(); 
		System.out.println(animal);

/*		Animal animal = new Eagle(); 
		System.out.println(animal);

		Animal animal = new Condor(); 
		System.out.println(animal);
*/	
/*
		Animal animal2 = new Eagle();
		System.out.println(animal2);
		
		Bird bird = (Bird) animal; // RuntimeException
		System.out.println(bird);
		
		Animal eagle = new Eagle(); //eagle이라는 이름을 가진 animal 한테 eagle을 줌
		Bird bird2 = (Bird) eagle;
		System.out.println(bird2);
		Eagle eagle2 = (Eagle) eagle;
		System.out.println(eagle2);
		Condor condor2 = (Condor) eagle;
		System.out.println(condor2);
	}*/
}
}
