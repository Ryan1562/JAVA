package ch10;
import java.util.Scanner;
public class Except2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		while(true) {
			System.out.println("첫번째 숫자를 입력하세요");
			String str = sc.nextLine();
			if (str.equals("x")) break;
//			try ~ catch를 사용하면 그 경우만 제외하고(예외처리) 계속 실행할 수 있다
			try {
				num1 = Integer.parseInt(str);
				System.out.println("두번째 숫자를 입력하세요");
				num2 = Integer.parseInt(sc.nextLine());			
				System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
//	catch처리 순서 위부터, 범위가 좁은 것부터 널은 순서로 배치해야 된다			
			} catch (ArithmeticException e) {
				System.out.println("영으로는 못 나눕니다");
			} catch (NumberFormatException e) {
				System.out.println("문자는 정수로 변경할 수 없습니다");
			} catch (Exception e) { // 모든 에러를 처리를 할 것
				System.out.println(e.getMessage());
			}			
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}