package ch03;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ran = (int)(Math.random() * 100) + 1;  // ran에는 1 ~ 100사이 정수
		int num = 0, cnt = 0;
		do {
			System.out.println("숫자를 맞춰 보세요");
			num = sc.nextInt();
			if (num > ran) System.out.println("작은 수를 입력하세요");
			else if (num < ran) System.out.println("큰수를 입력하세요");
			cnt++;
		}while(ran != num);
		System.out.println("숫자 "+num+"을 "+cnt+"번에 맞췃습니다");
		sc.close();
	}
}