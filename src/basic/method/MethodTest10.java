package basic.method;
//Q. 배열에서 가장 큰 값을 리턴하도록!
public class MethodTest10 {
		public static void main(String[] args) {
		int[] n = {23, 10, 70, 80, 60, 25};
		
		int max = maxNumber(n);
		
		System.out.println("MAX: " + max);
	}

		private static int maxNumber(int[] mstr) {
			int maxnum = mstr[0];
			for(int i = 0; i < mstr.length; i++) {
				if(maxnum < mstr[i]) {
					maxnum = mstr[i];
				}else if(maxnum >= mstr[i]){
					maxnum = maxnum;
				}
					}
			return maxnum;
	}
	}
	/*
	 * private static int maxNumber(int[] n) {
	 * int max = n[0]; // 밖에 있는 경우 for문과 관계 없음! 즉, max=23 고정이 아니야!
	 * for(int i =1; i < n.length; i++){
	 * 	if(max < n[i]) {
	 * 		max = n[i];
	 * 		}
	 * 	}
	 * return max;
	 * */