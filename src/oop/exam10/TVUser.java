package oop.exam10;
//1 인터페이스 사용해서 samsung, lgtv의 기능 리턴
//2 삼성은 HarmanSpeaker, 엘지는 AppleSpeaker 사용(방법 2개 new 이용 or not)
//3 소니티비에 OrangeSpeaker 연결
//3_1 RemoteControl 생성해서 iphone remotecon으로 조정
//4_reflection?! Annotation?! Property file?! :product.properties file 참조
public class TVUser {
	public static void main(String[] args) {
		TV tv1 = new SamsungTV(); //인터페이스 TV는 LgTV, SamsungTV 모두 upcasting 형태로 이용가능.
		// new HarmanSpeaker(); 없애고 난 후, Harman을 연결하고 싶을 때!
		tv1.setSpeaker(new HarmanSpeaker());
		tv1.poweron();
		tv1.ChannelUp();
		tv1.ChannelUp();
		tv1.SoundUP();
		tv1.SoundUP();
		tv1.ChannelDown();
		tv1.SoundDOWN();
		tv1.poweroff();
		System.out.println();
		
		TV tv2 = new LgTV();
		tv2.setSpeaker(new AppleSpeaker());
		tv2.poweron();
		tv2.ChannelUp();
		tv2.ChannelUp();
		tv2.SoundUP();
		tv2.SoundUP();
		tv2.ChannelDown();
		tv2.SoundDOWN();
		tv2.poweroff();
		System.out.println();
		
		TV tv3 = new SonyTV();
		tv3.setSpeaker(new RedSpeaker());
		tv3.setRc(new IphoneBluetooth());
		tv3.poweron();
		tv3.ChannelDown();
		tv3.ChannelDown();
		tv3.SoundUP();
		tv3.poweroff();
		
	}
}

/*
 * property file version
 * 
 * package oop.exam10;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception {
		//LgTV에 AppleSpeaker 연결 
		//SonyTV에 OrangeSpeaker 연결
		Properties p = new Properties();
		p.load(new FileInputStream("product.properties"));
		Class clazz1 = Class.forName(p.getProperty("tv"));
		Class clazz2 = Class.forName(p.getProperty("speaker"));
		
		TV tv = (TV) clazz1.newInstance(); //new SonyTV();
		Speaker speaker = (Speaker) clazz2.newInstance();
		
		tv.setSpeaker(speaker);
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}*/
