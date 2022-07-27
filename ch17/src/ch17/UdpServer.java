package ch17;
import java.io.IOException;
import java.net.*;
public class UdpServer {
	public static void main(String[] args) throws IOException {
		byte[] bt = new byte[50];  // 데이터 50byte 패킷에 담아서 전달할 때, 받을 때
		DatagramPacket dp = new DatagramPacket(bt, bt.length);
		DatagramSocket ds = new DatagramSocket(5007);
		String msg = "";
		while(true) {
			ds.receive(dp);
			InetAddress addr = dp.getAddress();
			msg = new String(dp.getData(), 0, dp.getLength());
			System.out.println(addr+" => " + msg);
		} 
	}
}