package ch10;
import java.util.Scanner;
public class Assert1 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		num = sc.nextInt();
		assert (num <= 100 && num >= 0) : "점수는 0 ~ 100사이 입니다";
		System.out.println("입력된 점수 : " + num);

		sc.close();

	}
}