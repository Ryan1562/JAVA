package ch12;
import javax.swing.JOptionPane;
public class Input1 {
	public static void main(String[] args) {
		for(int i =0; i <20; i++) {
			System.out.println(i);
			try {	Thread.sleep(500);
			} catch (InterruptedException e) {	}			
		}
		String str = JOptionPane.showInputDialog("아무거나 입력해");
		System.out.println("입력한 문자 : " + str);
	}
}