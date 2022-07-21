package ch12;
class Thread1 extends Thread {
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.print("쓰레드"+i+"\t");
			if (i % 10 == 9) System.out.println();
			try {	Thread.sleep(500); // 500/1000초 0.5초 쉬어라
			} catch (InterruptedException e) {	}
		}
	}
}
public class ThreadEx1 {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		Thread1 th2 = new Thread1();
//		th1.run();  // 멀티 쓰레드를 사용하지 않고 실행
//		th2.run();
		th1.start();  th2.start();
		for(int i = 0; i < 20; i++) {
			System.out.print("메인"+i+"\t");
			if (i % 10 == 9) System.out.println();
			try {	Thread.sleep(500); // 500/1000초 0.5초 쉬어라
			} catch (InterruptedException e) {	}
		}
	}
}