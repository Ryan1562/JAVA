package ch17;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.GregorianCalendar;
public class TimeServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7000);
		System.out.println("접속 대기 중...");
		try {
			while(true) {
				Socket client = ss.accept();  // client연결
				OutputStream os = client.getOutputStream(); // client에데이터를 전송
				ObjectOutputStream oos = new ObjectOutputStream(os); // 데이터를 직열화해서
				oos.writeObject(new GregorianCalendar());  // 오늘 날자를 client에 전송 직열화 해서
				oos.flush(); // OutputStream의 데이터 완전히 보내서 비운다
				os.close();
				oos.close();
				client.close();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ss.close();
	}
}