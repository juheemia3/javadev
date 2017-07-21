package basic.enumeration;

import static basic.enumeration.PowerState.OFF;
import static basic.enumeration.PowerState.ON;
import static basic.enumeration.PowerState.SUSPEND;

public class Computer extends ElectricDevice{
	private PowerState state = OFF; // 0: off, 1: on, 2:suspend
	
	
	@Override
	public void turnOn() {
		state = ON;
		
	}

	@Override
	public void turnOFF() {
		state = OFF;

	}
	
	public void suspend() {
		state = SUSPEND;
	}

	public void setState(PowerState state) { //int -> PowerState로 변경: ON, OFF, SUSPEND 값만 들어올 수 있음.(type을 맞춰줘야하니까)
		switch (state) {
		case ON:
			/*System.out.println("전원이 켜졌습니다.");*/
			break;
		case OFF:
			/*System.out.println("전원이 꺼졌습니다.");*/
			break;
		case SUSPEND:
			/*	System.out.println("먹통:(");*/
		}
		System.out.println(state);
	}
}
