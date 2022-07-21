package ch12;
class Thread3 extends Thread {
	public Thread3(String title) {
		super(title);
	}
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.print(getName()+i+"\t");
			if (i % 10 == 9) System.out.println();
			try { Thread.sleep(1000);
			} catch (InterruptedException e) {	}
		}
	}
}
public class Thread3Ex {
	public static void main(String[] args) {
		Thread3 th1 = new Thread3("첫번째");
		Thread3 th2 = new Thread3("두번째");
		th1.start();  th2.start();
//		th1.run();  th2.run();
		for(int i = 0; i < 20; i++) {
			System.out.print("메인"+i+"\t");
			if (i % 10 == 9) System.out.println();
			try { Thread.sleep(1000);
			} catch (InterruptedException e) {	}
		}
	}
}