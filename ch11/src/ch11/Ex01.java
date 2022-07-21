package ch11;
import java.util.ArrayList;
public class Ex01 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(1); list1.add(2); list1.add(3); list1.add(4); 
		list2.add(3); list2.add(4); list2.add(5); list2.add(6);
		System.out.println(list1);
		System.out.println(list2);
		ArrayList<Integer> kyo = new ArrayList<>();
		ArrayList<Integer> hap = new ArrayList<>();		
		ArrayList<Integer> cha1 = new ArrayList<>();
		ArrayList<Integer> cha2 = new ArrayList<>();
		kyo.addAll(list1); kyo.retainAll(list2);
		System.out.println(kyo);
		hap.addAll(list1); hap.removeAll(kyo); hap.addAll(list2);
		System.out.println(hap);
		cha1.addAll(list1); cha1.removeAll(list2);
		System.out.println(cha1);
		cha2.addAll(list2); cha2.removeAll(list1);
		System.out.println(cha2);
	}
}