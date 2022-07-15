package ch11;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedList1 {
	public static void main(String[] args) {
// 		배열보다 추가, 삭제 편리하지만 속도는 배열이 빠르다
// 		LinkedList al 사과, 수박, 바나나, 딸기, 수박을 추가
		LinkedList<String> al = new LinkedList<>();
		al.add("사과"); al.add("수박"); al.add("바나나"); al.add("딸기"); al.add("수박");
//		일반 for문으로 출력
		for(int i =0; i < al.size();i++) {	System.out.print(al.get(i)+"\t");		}
		System.out.println();
//		인덱스 2번쨰에 키위를 추가하고 확장 for문으로 출력
		al.add(2,"키위");
		for(String s : al) {	System.out.print(s+"\t");		}
		System.out.println();
//		인덱스 4번째를 포도를 변경하고 iterator를 사용하여  출력
		al.set(4, "포도");
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {	System.out.print(it.next()+"\t");		}
		System.out.println();
//		인덱스 첫번째 것을 삭제하고 al을 직접출력하는 prn(LinkedList al) 메서드를 이용하여 출력
		al.remove(0); prn(al);
//		수박을 삭제하고   
		al.remove("수박"); prn(al);
	}
	private static void prn(LinkedList<String> al) {
		System.out.println(al);		
	}
}

