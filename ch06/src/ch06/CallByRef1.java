package ch06;
import java.util.Arrays;
class D1 {
//	전달되는 주소 값
	void m1(int[] x) {
		x[0] = 88;
		x[2] = 77;
		System.out.println(Arrays.toString(x));
	}
}
public class CallByRef1 {
	public static void main(String[] args) {
		int[] x = {12, 15, 17, 20 };
		D1 d1 = new D1();
		d1.m1(x);
		System.out.println(Arrays.toString(x));
	}
}