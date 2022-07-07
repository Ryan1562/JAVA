package ch07;
public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student("세정", 28, "1반");
		Student st2 = new Student("이준호", 28, "2반");
		Teacher th1 = new Teacher("하정우", 45, "자바");
		Teacher th2 = new Teacher("로제", 25, "JSP");
		Manager mg1 = new Manager("뷔", 27, "노래");
		Manager mg2 = new Manager("정준하",52,"화장실 청소");
		st1.printSt(); st2.printSt();
		th1.printTh(); th2.printTh();
		mg1.printmg(); mg2.printmg();
	}
}
