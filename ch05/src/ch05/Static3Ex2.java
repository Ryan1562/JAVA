package ch05;

public class Static3Ex2 {
	static int i1 = 5;  // 전역변수, instance변수(멤버변수)
	static int i2 = 12;
	static void add() { // instance메서드
		System.out.printf("%d + %d = %d\n", i1, i2, i1 + i2);
	}
	public static void main(String[] args) {
//		System.out.println("i1 = " + Static3Ex2.i1);
//		System.out.println("i2 = " + Static3Ex2.i2);
//		Static3Ex2.add();
//		클래스명과 main() 메서드를 가진 클래스와 같을 때는 클래스명을 생략할 수 있다
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		add();
	}
}