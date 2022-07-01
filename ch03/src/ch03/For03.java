package ch03;

public class For03 {
	public static void main(String[] args) {
		// evenSum, oddSum, sum 짝수합, 홀수합, 전체 합 1 ~ 100
		int evenSum = 0, oddSum =0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) evenSum += i;
			else oddSum += i;
		}
		System.out.println("짝수 합 : " + evenSum);
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("전체 합 : " + (evenSum + oddSum));
	}
}