package ch03;
import java.util.Scanner;
public class Scanner2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("정수를 입력하세요");
			num = sc.nextInt(); // 정수 부분까진만 읽고 enter 무시
			System.out.println("입력한 정수 : " + num);
			if (num == 0) 
				break; // 반복문 종료
		}while(true);
		System.out.println("프로그램 종료");
		sc.close();
	}
}