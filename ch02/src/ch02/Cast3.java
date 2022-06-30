package ch02;

public class Cast3 {
	public static void main(String[] args) {
//		범위가 맞지 않는 데이터를 강제 형변환하면 쓰레기 값이 나온다
		byte b1 = (byte)128;  // -128 ~ 127
		System.out.println("b1 = "+ b1);
		byte b2 = (byte)256;
		System.out.println("b2 = "+ b2);
	}
}