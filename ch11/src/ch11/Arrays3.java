package ch11;
import java.util.Arrays;
public class Arrays3 {
	public static void main(String[] args) {
//		binarySearch는 sort와 같이 사용해야 작동된다, 오름차순
		Integer[] scores = {99, 97, 98};
		Arrays.sort(scores);  // 오름 차순 정열, 작은 값 부터
		System.out.println(Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스 : " + index);
		
		String[] name = {"제니", "로제", "효연", "보검"};
		System.out.println(Arrays.toString(name));
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		index = Arrays.binarySearch(name, "제니");
		System.out.println("찾은 인덱스 : " + index);
//		객체를 만들고 binarySearch 사용
		Member1 m1 = new Member1("차은우");
		Member1 m2 = new Member1("이지은");
		Member1 m3 = new Member1("박보검");
		Member1 m4 = new Member1("이효리");
		Member1[] members = {m1, m2, m3, m4};
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		index = Arrays.binarySearch(members, m2);
	}
}