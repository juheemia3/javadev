package oop.exam10;

public interface TV { //인터페이스에 들어오는 method는 기본적으로 추상method(default)니 꼭 abstract 적어줄 필요는 없다.
/*	String speaker1;
	public Speaker speaker;
    TV마다 speaker 만들기 귀찮은데, 이런 방법으로 할 수는 없나? 만약에 되면 뭐가 다르지..? private, public도 다르고 하니까*/
	
	public abstract void poweron();
	public abstract void poweroff();	
	public abstract void ChannelUp();	
	public abstract void ChannelDown();	
	public abstract void SoundUP();	
	public abstract void SoundDOWN();
	public abstract void setSpeaker(Speaker speaker);
	public void setRc(RemoteControl rc);
	
}
