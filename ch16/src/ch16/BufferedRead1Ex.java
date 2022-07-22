package ch16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedRead1Ex {
	public static void main(String[] args) throws IOException {
//		            1줄           묶어서       (  입력스트림에 문자단위(콘솔에 입력));  System.in.read() 1byte
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름을 입력하세요");
		String name = br.readLine();  // 한줄읽기
		System.out.println("주소를 입력하세요");
		String address = br.readLine();  // 한줄읽기
		System.out.println(name+"님 방가 !!! "+address+"에 사시는 군요");
		br.close();
	}
}