package ch13;
import java.awt.Color;
import java.awt.Frame;
public class Frame1 extends Frame {
	public Frame1() {
		setSize(300, 300); // 가로, 세로
		setBackground(Color.red);  // 배경색
		setVisible(true);  // 보여줘
	}
	public static void main(String[] args) {
		new Frame1();
	}
}
