package oop.exam10;

public class AppleSpeaker implements Speaker {

	@Override
	public void SoundUP() {
		System.out.println("AppleSpeaker : 소리 ▲");	
	}

	@Override
	public void SoundDown() {
		System.out.println("AppleSpeaker : 소리 ▼");	

	}

}
