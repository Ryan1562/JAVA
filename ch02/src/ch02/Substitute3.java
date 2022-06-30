package ch02;

public class Substitute3 {
	public static void main(String[] args) {
		int i1 = 10, i2 = 5;
		i1 += i2; // 15 + 5
		System.out.println("i1 = "+i1+", i2 = " +i2);
		i1 -= i2; // 15 - 5
		System.out.println("i1 = "+i1+", i2 = " +i2);
		i1 *= i2; // 10 * 5
		System.out.println("i1 = "+i1+", i2 = " +i2);
		i1 /= i2; // 50 / 5
		System.out.println("i1 = "+i1+", i2 = " +i2);
		i1 %= i2; // 10 % 5
		System.out.println("i1 = "+i1+", i2 = " +i2);
//		각각의 작업 후에 i1과 i2를 출력
	}
}
