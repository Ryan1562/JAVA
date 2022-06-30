package ch03;
import java.io.IOException;
public class Io1 {
	public static void main(String[] args) throws IOException {
		System.out.println("정수 한자리를 입력하세요");
		int num = System.in.read() - '0';
		System.out.println("입력된 값 : " + num);
	}
}