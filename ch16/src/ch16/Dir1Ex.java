package ch16;
import java.io.File;
public class Dir1Ex {
	public static void main(String[] args) {
//		File dir = new File(".");
//		File dir = new File("./src/ch16");
//		File dir = new File("src/ch16");
//		File dir = new File("../ch12/src/ch12");
//		File dir = new File("../ch02/src/ch02");  // 상대경로
//		\\   ==    /
		File dir = new File("C:/java/JavaSrc\\ch12\\src\\ch12");  // 절대경로
		String[] strs = dir.list();
		for(String str:strs) {
			System.out.println(str);
		}
	}
}