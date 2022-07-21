package ch12;
import java.util.ArrayList;
public class JoinTest {
	public static ArrayList<String> carList = new ArrayList<>();
	public static void main(String[] args) throws InterruptedException {
		BeforeThread1 bt = new BeforeThread1("before");
		AfterThread1  at = new AfterThread1("after");
		bt.start();  // 자동차 목록이 등록 중인데
		bt.join();   // bt작업이 종료한 후에 at실행
		at.start();  // 자동차 목록 출력
	}
}