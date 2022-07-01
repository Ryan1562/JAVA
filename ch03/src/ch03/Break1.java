package ch03;

public class Break1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if ( i == 50) break;  // 반복문 종료
		}
		System.out.println("합계 : " + sum);
	}
}
