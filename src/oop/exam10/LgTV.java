package oop.exam10;
//TVon, TVoff, Channelup, Channelup, Volon, Voloff 6가지 기능 생성
//TV 인터페이스를 사용하여 Samsung과 Lg는 똑같은 method사용. method안의 내용은 다르더라도, method의 이름은 동일(표준화 할 수 있다!)

public class LgTV implements TV {//implements TV를 하면 Lg TV에서는 interface TV에 있는 method를 꼭 구현해야 함!!(method의 이름이 동일해야)

	private Speaker speaker; //★ 이건 각각 생성해 줘야함!
	private RemoteControl rc;
	
	public void poweron() {
		System.out.println("LgTV : tv를 켭니다.");
	}// 만약 이 method의 이름을 turnon으로 이용하고 싶다면, TV interface의 method인 poweron을 그대로 이용하고 
    //	poweron method안({})에서 turnon을 만들고 그게 구현되게 해야함. or error!
	
	
	public void poweroff() {
		System.out.println("LgTV : tv를 끕니다.");
	}
	
	public void ChannelUp() {
		System.out.println("LgTV : 채널을 올립니다.");
	}
	
	public void ChannelDown() {
		System.out.println("LgTV : 채널을 내립니다.");
	}
	
	public void SoundUP() {
		if (speaker == null) {
		System.out.println("LgTV : 소리 크게");
	} else {
		speaker.SoundUP();
		}
	}
	
	public void SoundDOWN() {
		if (speaker == null) {
		System.out.println("LgTV : 소리 작게");
	} else {
		speaker.SoundDown();
		}
	}


	@Override //interface TV에 speakersetter를 만들면 자동으로 override하라고 나옴!
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;		
	}


	@Override
	public void setRc(RemoteControl rc) {
		this.rc = rc;
		
	}



}
