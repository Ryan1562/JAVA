package ch05;

public class Static3Ex {
	int i1 = 5;  // 전역변수, instance변수(멤버변수)
	int i2 = 12;
	Static3Ex() { }
	void add() { // instance메서드
		System.out.printf("%d + %d = %d\n", i1, i2, i1 + i2);
	}
	public static void main(String[] args) {
		Static3Ex s1 = new Static3Ex();
//		int i2 = 12; // 지역변수
		System.out.println("i1 = " + s1.i1);
		System.out.println("i2 = " + s1.i2);
		s1.add();
	}
}