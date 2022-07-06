package ch05;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "아이유"; p1.age = 28; p1.hobby = "침밷기";
		Person p2 = new Person("로제");
		p2.age = 25; p2.hobby = "욕하기";
		Person p3 = new Person("보검", 32);
		p3.hobby = "졸기";
		Person p4 = new Person("블랙핑크", 27, "춤");
//		                   0    1   2   3
		Person[] person = {p1, p2, p3, p4};
//		확장 for
		for (Person p : person) {
			p.print();
		}
//		for(int i = 0; i < person.length; i++) {
//			person[i].print();
//		}
//		p1.print(); p2.print(); p3.print(); p4.print();
	}
}
