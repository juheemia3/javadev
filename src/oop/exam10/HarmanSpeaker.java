package oop.exam10;

public class HarmanSpeaker implements Speaker{

	@Override
	public void SoundUP() {
		System.out.println("HarmanSpeaker : 소리 △");		
	}

	@Override
	public void SoundDown() {
		System.out.println("HarmanSpeaker : 소리 ▽");		
	}

}
