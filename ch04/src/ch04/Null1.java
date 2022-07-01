package ch04;

public class Null1 {
	public static void main(String[] args) {
		int i1 = 0;  // 기본형은 초기화 해야 사용 가능
		System.out.println("i1= " + i1);
		int[] k1 = new int[3]; // 참조형은 숫자는 0, bool형 false, 문자(열) null로 초기화 되어 있음
		System.out.println("k1[0] = " + k1[0]);
		System.out.println("k1[2] = " + k1[2]);
	}
}