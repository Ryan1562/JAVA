package ch03;
public class Do2 {
	public static void main(String[] args) {
		// 1 ~ 10까지 합계 do ~ while사용
		int i = 1, sum = 0;
		do {
			sum += i;
			System.out.println(i+"까지 합계 : " + sum);
			i++;
		}while(i<=10);
		System.out.println("합계 : " + sum);
	}
}