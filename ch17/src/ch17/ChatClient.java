package ch17;
import java.io.*;
import java.net.*;
import java.util.*;
public class ChatClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("연결할 ip");
		String ip = sc.nextLine();
		System.out.println("전달할 메세지");
		String msg = sc.nextLine();
		Socket client = new Socket(ip, 7001);
		OutputStream os = client.getOutputStream();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		bw.write(msg); // 메세지 서버에 보내기
		bw.flush();    // 밀어내기
		os.close(); bw.close(); client.close();
		sc.close();
		System.out.println("데이터 전송 완료");
	}
}
