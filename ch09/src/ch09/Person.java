package ch09;
//  최상위 클래스(조상) Object이므로 extends Object는 표시하지 않음
public class Person{
	int jumin;  String name;	int age;
	public Person(int jumin, String name, int age) {
		this.jumin = jumin;  this.name=name;  this.age = age;
	}
//	같다는 기준을 정하는 메서드
	public boolean equals(Object obj) {
//		주민번호가 같으면 같다고 정하자 // 숫자는 ==(기본형)로 비교
//		if (obj != null && obj instanceof Person) {
//			return jumin == ((Person)obj).jumin;
//		}
//		이름이 같으면 같다고 정하자    // 문자(객체, 참조형)는 equals로 비교
		if (obj != null && obj instanceof Person) {
			return name.equals(((Person)obj).name);
		}
		return false;
	}
	public String toString() { // 객체를 문자형식으로 출력할 때 기준
		return "주민번호:"+jumin+", 이름:"+name+", 나이:"+age;
	}
}