package ch06;
class Car2 {
	Car2() {
		System.out.println("난 매개변수 없어 출력");
	}
	Car2(String name) {
		this();
		System.out.println("이름 : " + name);
	}
	Car2(String name, String color) {
		this(name);
		System.out.println("이름 : " + name+", 색깔 : "+color);
	}
	void print() {
		System.out.println("대박");
	}
}
public class Car2Ex {
	public static void main(String[] args) {
		Car2 c2 = new Car2("BMW", "빨강");
		c2.print();
	}
}