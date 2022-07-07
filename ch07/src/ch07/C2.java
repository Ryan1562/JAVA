package ch07;

public class C2 extends C1 { // C1이 먼저 생성되어야 C2를 생성할 수 있다
	int c2 = 100;
	C2() {
		System.out.println("난 아버지 생성자");
	}
	void c21() {
		System.out.println("난 아버지 메서드");
	}
}

class C3 extends C2 { // C2가 먼저 생성되어야 C3를 생성할 수 있다
	String c3 = "덥니";
	C3() {
		System.out.println("난 자식 생성자");
	}
	void c31() {
		System.out.println("난 자식 메서드");
	}
}