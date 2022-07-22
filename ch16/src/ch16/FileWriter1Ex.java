package ch16;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWriter1Ex {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하셈");
		String fileName = sc.nextLine();
		System.out.println("저장할 글을 입력하셈");
		String msg = sc.nextLine();
		FileWriter fw = new FileWriter(fileName);
		fw.write(msg);
		System.out.println("파일 저장 완료");
		fw.close();  		sc.close();
	}
}