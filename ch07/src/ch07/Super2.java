package ch07;
class F1 {
	int x = 1000;
	void display() {
		System.out.println("부모 메서드입니다");
	}
}
class F2 extends F1 {
	int x = 2000;
	void display() {
		System.out.println("자식 메서드 입니다");
	}
	void print() {
		System.out.println("x = " + super.x);
		super.display();
		System.out.println("x = " + x);
		display();
	}
}
public class Super2 {
	public static void main(String[] args) {
		F2 f2 = new F2();
		f2.print();
	}
}
