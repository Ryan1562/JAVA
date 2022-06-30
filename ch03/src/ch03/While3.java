package ch03;

public class While3 {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		while(i < 10) {
			sum += i;
			i++;
		}
		System.out.println("합계 : " + sum);
	}
}