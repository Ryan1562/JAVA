package ch03;
import java.io.IOException;
public class While4 {
	public static void main(String[] args) throws IOException {
		System.out.println("보고 싶은 구구단은?");
		int i = 1;
		int num = System.in.read() - '0';
		while(i < 10) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
			i++;
		}
	}
}