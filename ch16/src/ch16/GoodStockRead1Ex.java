package ch16;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class GoodStockRead1Ex {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("stock.txt"));
			while(true) {
				GoodStock1 gs = (GoodStock1) ois.readObject();
				System.out.println(gs);
			}
		} catch (EOFException e) {
			System.out.println("데이터 다 읽었다");
		} finally {
			ois.close();
		}
	}
}
