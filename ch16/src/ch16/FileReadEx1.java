package ch16;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileReadEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("읽을 파일명은 ?");
		String fileName = br1.readLine();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		while(true) {
			String str = br.readLine();
			if (str == null) break;
			System.out.println(str);
		}
		br.close();  br1.close();
		System.out.println("프로그램 종료");
	}
}
