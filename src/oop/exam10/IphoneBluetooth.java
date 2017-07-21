package oop.exam10;

public class IphoneBluetooth implements RemoteControl {

	@Override
	public void ChannelUP() {
		System.out.println("Iphone Remote Control 작동 : 채널 UP!!");

	}

	@Override
	public void ChannelDOWN() {
		System.out.println("Iphone Remote Control 작동 : 채널 DOWN!!");

	}

}
