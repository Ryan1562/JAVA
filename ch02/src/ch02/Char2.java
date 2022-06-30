package ch02;

public class Char2 {
	public static void main(String[] args) {
		char c1 = 'A';
//		char c2 = ''; 1자아니므로 에러
//		char c2 = 'aa'; // 한자가 아니므로 에러
		char c2 = '\u0041';
		char c3 = '헐';
//		char c4 = "a"; 큰 따움표는 문자열
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
	}
}