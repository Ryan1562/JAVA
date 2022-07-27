package ch19;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Stream1Ex {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("로제"); list.add("세정"); list.add("은우"); list.add("보검");
		List<String> list = Arrays.asList("로제", "세정","은우","보검");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("=================");
		Stream<String> stream = list.stream();
//		name이라는 매개변수가 하나이므로 ()생략, 출력하는 문장이 하나이므로 {}생략
		stream.forEach(name->System.out.println(name));
	}
}