package ch03;
import java.io.IOException;
public class While4 {
	public static void main(String[] args) throws IOException {
		System.out.println("보고 싶은 구구단은 ?");
		int num = System.in.read() - '0';
		System.out.println("구구단 "+num+"단");
		int i = 1;
		while (i <= 9) {
			System.out.println(num +" * "+i+" = "+num*i);
			i++;
		}
	}
}