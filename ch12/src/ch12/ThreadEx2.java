package ch12;
class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.print("대박\t");
			if (i%10==9) System.out.println();
			try {	Thread.sleep(500);
			} catch (InterruptedException e) {	}
		}
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		Thread2 th2 = new Thread2();
		th2.start(); // th2.run(); 
		for(int i = 0; i < 20; i++) {
			System.out.print("사건\t");
			if (i%10==9) System.out.println();
			try {	Thread.sleep(500);
			} catch (InterruptedException e) {	}
		}
	}
}
