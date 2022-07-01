package ch03;
import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		// Scanner를 이용하여 숫자를 받아서 해당하는 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 ?");
		int num = sc.nextInt();
		System.out.printf("구구단 %d단\n",num);
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
		sc.close();
	}
}