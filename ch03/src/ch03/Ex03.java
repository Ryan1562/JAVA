package ch03;

public class Ex03 {
	public static void main(String[] args) {
//		주사위를 던져서 두수의 합이 6이되는 경우를 출력
//		1 + 5 = 6 2+4=6 ----------- 5 + 1 = 6
		for (int i = 1; i <= 6; i++) { // 첫번째 주사위
			for (int j = 1; j <= 6 ; j++) { // 두번째 주사위
				if (i + j == 6) {
					System.out.printf("%d + %d = %d\n", i, j, i+j);
				}
			}
		}
	}
}