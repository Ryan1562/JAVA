package ch03;

public class If1 {
	public static void main(String[] args) {
		int i1 = -7;
		if (i1 > 0) { // 조건이 true(참)인 경우에만 아래 문장 실행
			// {} 조건이 참이면 여러 문장 수해이 가능
			System.out.println(i1+"은 양수");
			System.out.println("대박 사건");
		} else {       // 조건이 false(거짓이면 실행)
			System.out.println(i1+"은 음수");
			System.out.println(-i1+"절대값으로 변경");
		}
		System.out.println("프로그램 종료");
	}
}