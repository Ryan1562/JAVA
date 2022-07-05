package ch05;
import java.util.Scanner;
public class Final2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		프로그램 이해가 싶다, 변경을 금지
		final int CIRCLE = 1;
		final int RECTANGLE = 2;
		final int TRIANGLE = 3;
//		CIRCLE = 7;
		while(true) {
			System.out.println("정수 1, 2, 3중에서 하나를 입력하세요");
			int num = sc.nextInt();
			if (num == 0) break;
			else if (num == CIRCLE) System.out.println("원입니다");
			else if (num == RECTANGLE) System.out.println("사각형입니다");
			else if (num == TRIANGLE) System.out.println("삼각형입니다");
			else System.out.println("1, 2, 3중에서 입력하세요");
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}