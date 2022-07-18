package ch11;
import java.util.HashSet;
public class Set3 {
	public static void main(String[] args) {
		String[] snakes = {"구렁이", "팔렁이", "구렁이","팔렁이","육렁이"};
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		for(String snake : snakes) {
//			hs1에 데이터를 추가하면 성공이 아니면?
			if (!hs1.add(snake)) {
				hs2.add(snake); // 입력에 실패한 데이터를 추가
			}
		}
		System.out.println(hs1);
		System.out.println(hs2);
		hs1.removeAll(hs2);  // hs1에 있는 데이터가 hs2와 같으면 제거
		System.out.println(hs1);
		System.out.println(hs2);
	}
}