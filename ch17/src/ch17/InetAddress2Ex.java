package ch17;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class InetAddress2Ex {
	public static void main(String[] args) throws UnknownHostException {
		Scanner sc = new Scanner(System.in);
		System.out.println("도메인을 입력하세요");
		String domain = sc.nextLine();
		InetAddress addr1 = InetAddress.getByName(domain);
		System.out.println(addr1.getHostAddress());  
		System.out.println(addr1.getHostName());
		sc.close();
	}
}