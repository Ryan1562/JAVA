package ch04;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		do {
			System.out.println("년도를 입력하세요");
			year = sc.nextInt();
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				System.out.println("윤년입니다");
			else
				System.out.println("평년입니다");
		} while (year != 0);
		System.out.println("프로그램 종료");
		sc.close();
	}
}
