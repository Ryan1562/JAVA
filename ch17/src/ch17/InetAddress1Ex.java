package ch17;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class InetAddress1Ex {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr1 = InetAddress.getByName("www.choongang.co.kr");
		System.out.println(addr1.getHostAddress());  // 35.213.149.53
		System.out.println(addr1.getHostName());     // www.choongang.co.kr
	}
}