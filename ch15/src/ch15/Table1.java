package ch15;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Table1 extends JFrame{
	public Table1() {
		String[] title = {"번호", "이름", "나이"};
		String data[][] = { {"1","세정","24"},{"2","원빈","37"},{"3","김태희","36"}};
		DefaultTableModel model = new DefaultTableModel(data, title);
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		add(sp); setSize(300, 200); setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Table1();
	}
}
