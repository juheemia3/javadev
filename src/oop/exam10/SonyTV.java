package oop.exam10;

public class SonyTV implements TV {
	
	private Speaker speaker;
	private RemoteControl rc;

	@Override
	public void poweron() {
		System.out.println("SonyTV : tv를 켭니다.");

	}

	@Override
	public void poweroff() {
		System.out.println("SonyTV : tv를 끕니다.");

	}

	@Override
	public void ChannelUp() {
		if ( rc == null){
		System.out.println("SonyTV : 채널을 올립니다.");
		} else {
			rc.ChannelUP();
		}
	}

	@Override
	public void ChannelDown() {
		if ( rc == null) {
		System.out.println("SonyTV : 채널을 내립니다.");
		} else {
			rc.ChannelDOWN();
		}
	}

	@Override
	public void SoundUP() {
		if (speaker == null) {
		System.out.println("SonyTV : 소리 크게");
		} else {
			speaker.SoundUP();
		}
	}

	@Override
	public void SoundDOWN() {
		if (speaker == null) {
		System.out.println("SonyTV : 소리 작게");
		} else {
			speaker.SoundDown();
		}
	}

	@Override
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;

	}

	@Override
	public void setRc(RemoteControl rc) {
		this.rc = rc;
		
	}

}
