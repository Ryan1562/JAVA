package ch07;

public class Teacher extends Person {
	private String subect;
	public Teacher(String name, int age, String subject) {
		setName(name); setAge(age); this.subect = subject;
	}
	public String getSubect() {
		return subect;
	}
	public void setSubect(String subect) {
		this.subect = subect;
	}
	void printTh() {
		print();
		System.out.println("과목 : " + subect);
	}
}