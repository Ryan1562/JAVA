package ch12;
class Run1 implements Runnable {
	public void run() {
		for(int i = 0; i <20; i++) {
//			Thread.currentThread().getName() 현재 작업중인 쓰레드
			System.out.print(Thread.currentThread().getName()+i+"\t");
			if (i % 10 == 9) System.out.println();
			try {	Thread.sleep(500);
			} catch (InterruptedException e) {	}
		}		
	}	
}
public class Runnable1Ex {
	public static void main(String[] args) {
		Run1 r1 = new Run1(); Run1 r2 = new Run1(); Run1 r3 = new Run1();
//		Runnable를 구현한 클래스를 바로 사용하지 못하고 Thread객체 생성할때 넣어서 생성하여  사용
		Thread th1 = new Thread(r1, "1번");  // 쓰레를 생성할 때 Runable를 구현한 객체와 이름을 추가
		Thread th2 = new Thread(r2, "2번");
		Thread th3 = new Thread(r3, "3번");
		th1.start();  th2.start();  th3.start();
		for(int i = 0; i <20; i++) {
			System.out.print("메인"+i+"\t");
			if (i % 10 == 9) System.out.println();
			try {	Thread.sleep(500);
			} catch (InterruptedException e) {	}
		}
	}
}
