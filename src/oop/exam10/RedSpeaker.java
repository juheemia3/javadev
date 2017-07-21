package oop.exam10;

public class RedSpeaker implements Speaker{

	@Override
	public void SoundUP() {
		System.out.println("RedSpeaker : 소리 ↑");
		
	}

	@Override
	public void SoundDown() {
		System.out.println("RedSpeaker : 소리 ↓");
		
	}

}
