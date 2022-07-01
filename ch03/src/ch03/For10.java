package ch03;
import java.util.Scanner;
public class For10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		while(num != 0) {
			System.out.println("구구단 ?");
			num = sc.nextInt();
			if (num >= 2 && num <= 9) {
				System.out.printf("구구단 %d단\n", num);
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", num, i, num*i);
				}
			} else 
				System.out.println("구구단 숫자가 아닙니다.");
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}