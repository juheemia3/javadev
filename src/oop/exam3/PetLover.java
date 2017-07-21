package oop.exam3;

public class PetLover extends Human {
	private String animalType;
	private int ayear;// Human의 year과 헷갈리지 않기 위해 ayear 사용
	
	
	public String getAnimalType() {
		return animalType;
	}


	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}


	public int getAyear() {
		return ayear;
	}


	public void setAyear(int ayear) {
		this.ayear = ayear;
	}


	@Override
	public String toString() {
		return super.toString() +
		"반려동물은 " + animalType + "이며\n" + ayear+ "생 입니다.";
	}

}
