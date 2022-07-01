package ch03;

public class Ex02 {
	public static void main(String[] args) {
		int sum = 0; // 1, 1+2, .... 1+2+3, ....+10
		int totalSum = 0; // 1+(1+2)+(1+2+3)+.....+(1+2+3+4+5+6+7+8+9+10)
		for(int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
//			System.out.println(i+"까지 합계 : " + sum);
			totalSum += sum; // totalSum = totalSum + sum;  // 1 + 3 + 6.....+ 55
//			System.out.println(i+"까지 합계 : " + totalSum);
		}
		System.out.println("합계 : " + sum);
		System.out.println("누계 : " + totalSum);
	}
}