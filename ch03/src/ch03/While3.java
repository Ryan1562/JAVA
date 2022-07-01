package ch03;
public class While3 {
	public static void main(String[] args) {
		int i = 10, sum = 0;  // int i = 1;  int sum = 0;
		while(i <= 0) {
			sum += i; // sum = sum + i;  // sum 1, i = 1, 1+2, 3+3, 6+4
			System.out.println(i+"까지 합계 : " + sum);
			i++; // ++는 1증가 2, 3, 4....10,11
		}
		System.out.println("합계 : " + sum);
	}
}