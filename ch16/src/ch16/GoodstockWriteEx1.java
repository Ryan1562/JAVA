package ch16;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class GoodstockWriteEx1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stock.txt"));
//		Serializable을 구현한 클래스만 사용 가능
		oos.writeObject(new GoodStock1("1111", 100));
		oos.writeObject(new GoodStock1("2222", 200));
		oos.writeObject(new GoodStock1("3333", 150));
		oos.close();
		System.out.println("주식 저장 완료");
	}
}