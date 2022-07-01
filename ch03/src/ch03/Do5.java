package ch03;
import java.io.IOException;
public class Do5 {
	public static void main(String[] args) throws IOException {
		int num =0, i =1;
		do {
			System.out.println("보고 싶은 구구단 ?");
			num = System.in.read() - '0';  // 5 + enter(CR(\r) + LF(\n))
			System.in.read(); // CR을 읽었지만 num에 저장 안됨
			System.in.read(); // LF을 읽었지만 num에 저장 안됨
			if (num < 2 || num > 9) 
				System.out.println("구구단 숫자가 아닙니다");
			else {
				do {
					System.out.printf("%d * %d = %d\n",num, i, num*i);
					i++;
				}while(i <= 9);
			}
			i = 1;
		}while(num != 0);
		System.out.println("프로그램 종료");
	}
}