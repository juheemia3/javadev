package oop.exam10;
//TVon, TVoff, Channelup, Channelup, Volon, Voloff 6가지 기능 생성

public class SamsungTV implements TV {//implements TV를 하면 Samsung TV에서는 interface TV에 있는 method를 꼭 구현해야 함!!(method의 이름이 동일해야)
//	private Speaker speaker = new HarmanSpeaker();// [2차작업: SamsungTV에 HarmanSpeaker 추가] Speaker interface가 있으니 HarmanSpeaker upcasting해서 참조
												  // 다만 이 경우(new를 이용) SamsungTV와, HarmanSpeaker의 결합도가 너무 높다.(의존적) 
                             					  // new 없애기 1) private Speaker speaker;
	private Speaker speaker;											  
												  
	public void setSpeaker(Speaker speaker) {     //		    2) setter 생성(이 경우, 꼭 HarmanSpeaker가 아닌 다른 스피커도 이용 가능 <- setter 안에 할당함으로서)
												  //               LgTV의 @override부분
		this.speaker = speaker;                   //            3) setSpeaker method를 TV? (TVuser?)에 복사
	}

	private RemoteControl rc;
	
	public void setRc(RemoteControl rc) {
		this.rc = rc;
	}

	public void poweron() {
		System.out.println("SamsungTV : tv를 켭니다.");
	}
	
	public void poweroff() {
		System.out.println("SamsungTV : tv를 끕니다.");
	}
	
	public void ChannelUp() {
		System.out.println("SamsungTV : 채널을 올립니다.");
	}
	
	public void ChannelDown() {
		System.out.println("SamsungTV : 채널을 내립니다.");
	}
	
	public void SoundUP() {
		if (speaker == null){
			System.out.println("SamsungTV : 소리 크게");
		} else { // speaker가 null이 아닌 지 어떻게 알지?
			     // Speaker speaker = new HarmanSpeaker(); 에서 speaker라는 컵을 만들고,
			     // 거기에 HarmanSpeaker를 담은 상태! null이 아닙니당!
			speaker.SoundUP();
		}
	}
	
	public void SoundDOWN() {
		if (speaker == null){
			System.out.println("SamsungTV : 소리 작게");
		} else {
			speaker.SoundDown();
		}
	}

	
}
