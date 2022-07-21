package ch11;
import java.util.ArrayList;
public class Gene1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(1); list.add(2); list.add("대박");
		list.add(3); list.add(4); list.add("사건");
		System.out.println(list);
//		담을 데이터 형을 고정
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1); list2.add(2); // list2.add("대박");
		list2.add(3); list2.add(4); // list2.add("사건");
		System.out.println(list2);
	}
}