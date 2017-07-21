package basic.method;
//Q-2. 배열에서 가장 작은 값을 리턴하도록!
public class MethodTest10_2 {
public static void main(String[] args) {
	int[] n = {30, 245, 43, 34, 64, 75, 23, 1};
	
	int min = minNumber(n);
	System.out.println("MIN : "+ min);
}

private static int minNumber(int[] minstr) {
	int min = minstr[0];
	for(int i = 1; i < minstr.length; i++){
		if( min > minstr[i]){
			min = minstr[i];
		}
	}
	return min;
}
}
