package ch07;
public class Person2Ex {
	public static void main(String[] args) {
		Person2[] persons = new Person2[6];
		persons[0] = new Student2("뷔",25, "1반");
		persons[1] = new Student2("로제", 25, "2반");
		persons[2] = new Teacher2("유재석", 51, "자바");
		persons[3] = new Teacher2("박보검", 32,"DB");
		persons[4] = new Manager2("전준하",52,"화장실 청소");
		persons[5] = new Manager2("제니", 26, "음악");
		
		for(Person2 p:persons) {
			p.print();
			if (p instanceof Manager2) {
				((Manager2)p).disp();
			}
		}
	}
}