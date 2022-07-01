package ch03;
import java.io.IOException;
public class Do4 {
	public static void main(String[] args) throws IOException {
//		콘솔로 부터 구구단 숫자를 입력 받아서 해당하는 구구단 출력 do ~ while이용
		System.out.println("보고 싶은 구구단 ?");
		int num = System.in.read() - '0';
		System.out.println("구구단 "+num+"단");
		int i = 1;
		do {
		//	System.out.println(num+" * " + i+" = " + num*i);
			System.out.printf("%d * %d = %d\n",num,i,num*i);
			i++;
		}while(i <= 9);
	}
}