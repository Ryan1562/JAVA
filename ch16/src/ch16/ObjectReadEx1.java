package ch16;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.GregorianCalendar;
public class ObjectReadEx1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("data.txt"));
			while(true) { // 데이터가 몇건왓는지 몰라
				GregorianCalendar gc = (GregorianCalendar) ois.readObject();
				System.out.printf("%TF\n", gc);
			}
		} catch (EOFException e) { // EOF End of File
			System.out.println("데이터 다 읽었다");
		} finally {
			ois.close();
		}
	}
}
