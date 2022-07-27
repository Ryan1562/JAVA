package ch19;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class FromArray1 {
	public static void main(String[] args) {
		String[] list = {"제니", "로제","은우","보검"};
		Stream<String> strStream = Arrays.stream(list);
		strStream.forEach(name->System.out.print(name+","));
		System.out.println("\n==============");
		Integer[] intArr = {45, 56,23,37};
		Stream<Integer> intStream = Arrays.stream(intArr);
		intStream.forEach(n->System.out.print(n+", "));
		System.out.println("\n==============");
		List<Student1> sts = Arrays.asList(new Student1("로제", 25), new Student1("은우", 32),
				new Student1("제니", 27), new Student1("보검", 31));
		Stream<Student1> stStream = sts.stream();
		stStream.forEach(n->System.out.print(n.getName()+", "));
		System.out.println("\n==============");
		stStream = sts.stream();
		stStream.forEach(n->System.out.print(n.getAge()+", "));
	}
}