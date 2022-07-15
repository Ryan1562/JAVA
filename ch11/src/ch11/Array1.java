package ch11;
import java.util.ArrayList;
import java.util.Iterator;
public class Array1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); // 저장할 데이터의 갯수가 제한 없음 // 배열은 갯수 제한
		al.add("구렁이"); al.add("팔렁이"); al.add("칠렁이"); 
		al.add("구렁삼"); al.add("구렁이"); // al.add(10);
		System.out.println("데이터 건수 : "+al.size());
		for(int i =0; i < al.size(); i++) {
			System.out.print(al.get(i)+"\t");
		}
		System.out.println();
		for(String snake : al) {
			System.out.print(snake+"\t");
		}
		System.out.println();
		Iterator<String> its = al.iterator(); // 데이터를 Iterator형식에 맞게 넣어라
		while(its.hasNext()) {
			System.out.print(its.next()+"\t");
		}
	}
}