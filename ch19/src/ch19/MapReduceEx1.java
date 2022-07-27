package ch19;
import java.util.Arrays;
import java.util.List;
public class MapReduceEx1 {
	public static void main(String[] args) {
		List<Student1> list = Arrays.asList(new Student1("로제", 25), new Student1("은우", 32),
				new Student1("제니", 27), new Student1("보검", 31));
//		                             Student1에서 나이만 읽어서   평균구하고     double형으로 변경   
		double avg = list.stream().mapToInt(Student1::getAge).average().getAsDouble();
		System.out.println("평균나이 : "+avg);
	}
}