package ch11;
import java.util.Vector;
public class Vector2 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>(5); // 용량(capacity) 5 데이터 다섯건 담을 공간 확보
		vec.add("1"); vec.add("2"); vec.add("3"); prn(vec);
		vec.trimToSize(); prn(vec);  // 데이터가 없는 공간 삭제 (용량과 크기가 같아진다)
		vec.ensureCapacity(6); prn(vec);  // 용량을 6으로 확대
//	문자는 null, 숫자는 0으로세팅, 용량이 꽉차서 넘치면 용량은 현재 요량의 두배로 변경됨 6 * 2 => 12	
		vec.setSize(7); prn(vec);  // 데이터 갯수를 7개로 늘려라
		vec.clear();    prn(vec);  // clear는 데이터 삭제
	}
	private static void prn(Vector<String> vec) {
		System.out.println(vec);
		System.out.println("갯수 : "+vec.size());
		System.out.println("용량 : "+vec.capacity());
	}
}