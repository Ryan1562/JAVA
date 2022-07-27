package ch19;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
class Student1 {
	private String name;
	private int age;
	public Student1(String name, int age) {
		this.name = name; this.age = age;
	}
	public String getName() {	return name;	}
	public int getAge() {		return age;		}	
}

public class LamdaStream2Ex {
	public static void main(String[] args) {
		List<Student1> list = Arrays.asList(new Student1("로제", 25), new Student1("은우", 32),
				new Student1("제니", 27), new Student1("보검", 31));
		Stream<Student1> stream = list.stream();
//		Student 약자로 s로 했는데 다른 문자를 써도 관계계없다
		stream.forEach(aa-> System.out.println(aa.getName()+" : "+aa.getAge()));
//		stream.forEach(s-> System.out.println(s.getName()+" : "+s.getAge()));
	}
}