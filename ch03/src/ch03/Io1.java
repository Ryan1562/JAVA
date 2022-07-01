package ch03;
import java.io.IOException;
public class Io1 {
	public static void main(String[] args) throws IOException {
		// System.out은 콘솔로 출력
		System.out.println("정수 한자리를 입력하세요");
		// System.in 콘솔에서 데이터를 받겠다 read() 한자리를 일겠다
		int num = System.in.read() - '0'; //48;
		System.out.println("입력된 값 : " + num);
	}
}