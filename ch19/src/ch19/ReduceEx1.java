package ch19;

import java.util.Arrays;
import java.util.List;

public class ReduceEx1 {
	public static void main(String[] args) {
		List<Student2> sList = Arrays.asList(new Student2("제니", 77),
				new Student2("보검", 99), new Student2("로제", 88));
		int sum1 = sList.stream().mapToInt(Student2::getScore).sum();
		int sum2 = sList.stream().map(Student2::getScore).reduce((a,b)->a+b).get();
		int sum3 = sList.stream().map(Student2::getScore).reduce(0,(a,b)->a+b);
		System.out.println("총점 : " + sum1);
		System.out.println("총점 : " + sum2);
		System.out.println("총점 : " + sum3);
	}
}
