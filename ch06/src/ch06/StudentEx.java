package ch06;

public class StudentEx {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "홍길똥"; st1.kor = 100; st1.eng = 60; st1.math = 66;
		st1.print();
		Student st2 = new Student("로제", 90, 80, 88);
		st2.print();
	}
}