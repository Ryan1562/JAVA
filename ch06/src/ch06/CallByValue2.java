package ch06;
class B2 {
	void swap(int x, int y) {
		int imsi = x;  // imsi = 10, x = 10
		x = y;     // x = 20, y = 20
		y = imsi;  // x = 20, y = 10
		System.out.println("m1 x = " + x);
		System.out.println("m1 y = " + y);
	}
}
public class CallByValue2 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		B2 b2 = new B2();
		b2.swap(x,y);
		System.out.println("main x = " + x);
		System.out.println("main y = " + y);
	}
}