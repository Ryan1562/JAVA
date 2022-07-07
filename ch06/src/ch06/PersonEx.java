package ch06;
class Person {
	private String name;	private int age;
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public int getAge() {		return age;	}
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("나이는 음수가 없습니다");
			age = 0;
		} else	this.age = age;
	}
	void print() {
		System.out.println("이름 : "+getName()+", 나이 : "+getAge());
	}
}
public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("아이유"); p1.setAge(-28);
		p1.print();
	}
}