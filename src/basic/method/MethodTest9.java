package basic.method;

public class MethodTest9 {
	public static void main(String[] args) {
		int[] n = {100, 200}; //배열 선언
		
		swapFunction(n);// call by reference : 참조에 의한 전달
		// swap function에 배열 n을 파라미터로 가져옴
		System.out.println(n[0]);
		System.out.println(n[1]);
	
	}

	private static void swapFunction(int[] JH) { //여기에서 n의 이름은 제약이 없음, 꼭 n이라고 하지 않아도 됨. e.g. private static void swapFunction(int[] JH)
		int temp = JH[0];
		JH[0] = JH[1];
		JH[1] = temp;
	} // 100과 200을 바꾸는 함수
}