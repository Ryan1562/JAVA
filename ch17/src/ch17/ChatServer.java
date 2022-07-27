package ch17;
import java.io.*;
import java.net.*;
public class ChatServer {
	public static void main(String[] args) {
		ServerSocket ss = null;		
		try {
			ss = new ServerSocket(7001);
			System.out.println("서버 실행 중");
			while(true) {
				Socket client = ss.accept();  // client대기 연결될 때까지
//				고객이 보낸 데이터 읽을 준비
				DataInputStream dis = new DataInputStream(client.getInputStream());
//				고객이 보낸 데이터 한줄씩 읽어서 처리할 준비
				BufferedReader br = new BufferedReader(new InputStreamReader(dis));
//				                      고객 ip                 고객이 보낸 메세지 한줄 읽어서 출력
				System.out.println(client.getInetAddress()+" => "+br.readLine());
				dis.close(); br.close(); client.close();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}