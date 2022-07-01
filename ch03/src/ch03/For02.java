package ch03;

public class For02 {
	public static void main(String[] args) {
		// 1 ~ 10까지 합계
		int sum = 0;
		for(int i = 1; i <= 10 ; i++) {
			sum += i;
			System.out.println(i+"까지 합계 : " + sum);
		}
		System.out.println("합계 : " + sum);
	}
}