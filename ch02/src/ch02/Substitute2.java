package ch02;

public class Substitute2 {
	public static void main(String[] args) {
		int i1 = 10;
		// i1 = i1+4 => 10 + 4
		System.out.println("i1 += "+(i1 += 4) );
		i1 -= 4;  // 14 - 4 => 10
		System.out.println("i1 -= "+ i1);
		i1 *= 4; // 10 * 4 => 40
		System.out.println("i1 *= "+ i1);
		i1 /= 4; // 40 /4 => 10
		System.out.println("i1 /= "+ i1);
		i1 %= 4;  // 10 % 4 => 10을 4로 나눈 나머지 2
		System.out.println("i1 %= "+ i1);
	}
}
