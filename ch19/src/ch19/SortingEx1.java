package ch19;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
public class SortingEx1 {
	public static void main(String[] args) {
		IntStream instream = Arrays.stream(new int[] {5,2,4,3,1});
		instream.sorted().forEach(n-> System.out.print(n+", "));
		System.out.println();
		List<Student2> list = Arrays.asList(new Student2("제니", 77), new Student2("IU", 66),
				new Student2("보검", 88), new Student2("로제", 58), new Student2("하니", 90));
		list.stream().sorted().forEach(s->System.out.print(s.getScore()+", "));
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder())
			.forEach(s->System.out.print(s.getScore()+", "));
	}
}