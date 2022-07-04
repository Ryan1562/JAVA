package ch04;
import java.util.Scanner;
public class LeakYear {
	public static void main(String[] args) {
		// Scanner 이용하여 년도 4자리 year받아서 윤년 또는 평년으로 출력
		// 0을 입력 하면 종료 아니면 계속 질의
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("년도 4자리 입력하세요");
			int year = sc.nextInt(); // 입력한 정수 읽기
			if (year == 0) break;
//				4나누어지고 100으로 안나누어지면 윤년				400으로 나누어 져도 6년
			else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year+"는 윤년입니다");
			} else System.out.println(year+"는 평년입니다");			
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}