package ch19;
import java.util.Arrays;import java.util.List;
import java.util.stream.Collectors;
public class ToListEx1 {
	public static void main(String[] args) {
		List<Student3> list = Arrays.asList(new Student3("로제", 88, Student3.Gender.FEMALE),
				new Student3("보검", 77, Student3.Gender.MALE),
				new Student3("제니", 99, Student3.Gender.FEMALE),
				new Student3("은우", 66, Student3.Gender.MALE));
//		남자만 출력
		List<Student3> maleList = list.stream().filter(s->s.getGender()==Student3.Gender.MALE)
				.collect(Collectors.toList());
		maleList.stream().forEach(s->System.out.print(s.getName()+" "));
		System.out.println();
//		여자만 출력
		List<Student3> femaleList = list.stream().filter(s->s.getGender()==Student3.Gender.FEMALE)
				.collect(Collectors.toList());
		femaleList.stream().forEach(s->System.out.print(s.getName()+" "));
	}
}