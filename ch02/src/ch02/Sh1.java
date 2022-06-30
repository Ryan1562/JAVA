package ch02;

public class Sh1 {
	public static void main(String[] args) {
		int num = 15;
		// 15 / 2^2 = 15 / 4 = 3 
		System.out.println("num >> 2 : "+(num >> 2));
		// 15 * 2^2 = 15 * 4 = 60
		System.out.println("num << 2 : "+(num << 2));
	}
}