package ch11;
import java.util.ArrayList;
public class Array2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); 
//		0                1               2
		al.add("구렁이"); al.add("팔렁이"); al.add("칠렁이"); 
		al.add("구렁삼"); al.add("구렁이"); print(al);
//		팔렁이 앞에 구럼사를 추가하고 싶다
		al.add(1,"구렁사"); print(al);
//		구렁삼을 도룡용으로 변경
		al.set(4,"도룡용"); print(al);
//		인덱스 2번째인 구렁이를 지우고 출력
		al.remove(2);    print(al);
//		구렁이를 삭제 같은 것이 두개 이상일 경우에는 첫번째 데이터 만 삭제
		al.remove("구렁이"); print(al);
	}
	private static void print(ArrayList<String> al) {
		System.out.println(al);		
	}
}