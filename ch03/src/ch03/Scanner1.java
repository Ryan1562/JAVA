package ch03;
import java.util.Scanner;
public class Scanner1 {
	public static void main(String[] args) {
		// 숫자 비교 ==, !=
		// 문자비교(내용) 문자.equals("문자"), !문자.equals("문자")
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("문자를 입력하세요");
			str = sc.nextLine(); // 한줄 읽기(enter CR+LF포함)
			System.out.println("입력한 문자 : " + str);
			if (str.equals("x")) 
				break; // 반복문 종료
		}while(true);
		System.out.println("프로그램 종료");
		sc.close();
	}
}