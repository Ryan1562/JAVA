package ch12;
class DaeMon1 extends Thread {
	public void run() {
		while(true) {
			System.out.println("데몬");
			try {	Thread.sleep(500);
			} catch (InterruptedException e) {	}
		}
	}
}
public class Daemon1Ex {
	public static void main(String[] args) {
		DaeMon1 dm = new DaeMon1();
//		main작업이 끝나면 모든 백 그라운드 쓰레드를 종료시킬 때
//		반드시 start보다 먼저 실행해야 된다
		dm.setDaemon(true);
		dm.start();
		for(int i =0 ; i < 20; i++) {
			System.out.println(i);
			try {	Thread.sleep(500);
			} catch (InterruptedException e) {	}
		}
	}
}