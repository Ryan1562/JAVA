package ch13;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActionEx1 extends Frame implements ActionListener{
	Button btn;
	TextArea ta;
	public ActionEx1() {
		btn = new Button("click Button"); // 버튼
		ta = new TextArea();
		add("North", btn);  // 북쪽에 btn
		add("Center", ta);  // 중앙에 ta를 붙여라
		setSize(300, 300);
		setVisible(true);
		btn.addActionListener(this);
	}
	public static void main(String[] args) {
		new ActionEx1();
	}
	public void actionPerformed(ActionEvent e) {
		ta.append("Button click \n");		
	}
}
