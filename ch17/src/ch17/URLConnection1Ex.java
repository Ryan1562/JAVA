package ch17;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class URLConnection1Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;   // 데이터를 한줄씩 처리
		System.out.println("url을 입력하세요");
		String addr = sc.nextLine();
		try {
			URL url = new URL(addr);
			URLConnection uc = url.openConnection(); // 인터넷 연결
			InputStream is = uc.getInputStream();
			br = new BufferedReader(new InputStreamReader(is, "utf-8"));
			String str = null;
			while((str = br.readLine()) != null) { // null 다 읽었다
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}