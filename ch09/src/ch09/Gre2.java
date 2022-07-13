package ch09;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Gre2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GregorianCalendar gc = new GregorianCalendar();
		while(true) {
			System.out.println("년도 4자리를 입력하세요");
			int year = sc.nextInt();
			if (year == 0) break;
			else if (gc.isLeapYear(year)) System.out.println("윤년입니다");
			else System.out.println("평년입니다");
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}