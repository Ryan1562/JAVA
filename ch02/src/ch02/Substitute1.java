package ch02;

public class Substitute1 {
	public static void main(String[] args) {
		int k1 = 10;
		k1 = k1 + 8; // 오른쪽 연산의 결과를 왼쪽에 대입(배정)
		k1 += 10;    // k1 = k1 + 10 단축 대입 연산자
		System.out.println("k1 = " + k1);
//		| 빠(파)이브, ~ 틸타, ^ hat

	}
}