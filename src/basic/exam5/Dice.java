package basic.exam5;
//jsp와 연동하여 사용하는 file
public class Dice {
	public static int rolling() {
		return (int)(Math.random() *6) + 1;
	}
} //dice.rolling을 실행하면 1~6사이의 숫자가 나오도록
