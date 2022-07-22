package ch16;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
public class ObjectOut1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
		oos.writeObject(new GregorianCalendar(2021,6,21));
		oos.writeObject(new GregorianCalendar(2021,6,22));
		oos.writeObject(new GregorianCalendar(2021,6,23));
		oos.close();
		System.out.println("직열화 파일 생성");
	}
}