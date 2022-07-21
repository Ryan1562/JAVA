package ch12;
import javax.swing.JOptionPane;
class ThreadTest1 extends Thread {
	public void run() {
		for(int i =0; i <20; i++) {
			System.out.println(i);
			try {	Thread.sleep(500);
			} catch (InterruptedException e) {	}			
		}
	}
}
public class Input2 {
	public static void main(String[] args) {
		ThreadTest1 th1 = new ThreadTest1();
		th1.start();
		String str = JOptionPane.showInputDialog("아무거나 입력해");
		System.out.println("입력한 문자 : " + str);
	}
}