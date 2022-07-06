package ch05;
public class Person {
	String name;
	int age;
	String hobby;
	public Person() {	}
	public Person(String n) {	
		name = n;
	}
	public Person(String n, int a) {	
		name = n; age = a;
	}
	public Person(String n, int a, String h) {	
		name = n; age = a; hobby = h;
	}
	void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("취미 : " + hobby);
		System.out.println("======================");
	}
}