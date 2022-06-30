package ch02;

public class Cast2 {
	public static void main(String[] args) {
		byte b1 = 35;
		int i1 = b1;
		byte b2 = (byte) i1;  // 범위가 넓은 곳에서 범위가 좁은 곳 down casting (강제)형변환
		System.out.println("b1 = " + b1);
		System.out.println("i1 = " + i1);
		System.out.println("b2 = " + b2);
	}
}
