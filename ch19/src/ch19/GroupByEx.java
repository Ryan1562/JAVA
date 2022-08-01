package ch19;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ch19.Student3.City;
public class GroupByEx {
	public static void main(String[] args) {
		List<Student3> list = Arrays.asList(new Student3("로제", 88, Student3.Gender.FEMALE,City.Seoul),
				new Student3("보검", 77, Student3.Gender.MALE,City.Seoul),
				new Student3("제니", 99, Student3.Gender.FEMALE,City.Pusan),
				new Student3("은우", 66, Student3.Gender.MALE,City.Pusan) );
		Map<Student3.Gender, List<Student3>> mapByGender = list.stream()
				.collect(Collectors.groupingBy(Student3::getGender));
		System.out.print("남자 : ");
		mapByGender.get(Student3.Gender.MALE).stream().forEach(s->System.out.print(s.getName()+" "));
		System.out.println();
		System.out.print("여자 : ");
		mapByGender.get(Student3.Gender.FEMALE).stream().forEach(s->System.out.print(s.getName()+" "));
		System.out.println();
		Map<Student3.City, List<Student3>> mapByCity = list.stream()
				.collect(Collectors.groupingBy(Student3::getCity));
		System.out.print("서울 : ");
		mapByCity.get(Student3.City.Seoul).stream().forEach(s->System.out.print(s.getName()+" "));
		System.out.println();
		System.out.print("부산 : ");
		mapByCity.get(Student3.City.Pusan).stream().forEach(s->System.out.print(s.getName()+" "));
		System.out.println();
	}
}