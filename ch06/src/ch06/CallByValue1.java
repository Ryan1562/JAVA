package ch06;
class B1 {
//	                  10     20
	public void m1(int x, int y) { // 변수명은 관계없고 값만 전달
		x += 7;  y += 7;
		System.out.println("m1 x = " + x);
		System.out.println("m1 y = " + y);
	}
}
public class CallByValue1 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		int x = 10, y = 20;
		b1.m1(x, y);
		System.out.println("main x = " + x);
		System.out.println("main y = " + y);
	}
}