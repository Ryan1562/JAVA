package ch03;

public class For07 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {  // 1번 변화면
			for (int j = 5; j > i; j--) { // 조건이 맞을 때까지 반복
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 5; i++) {  // 1번 변화면
			for (int j = 0; j < 5 - i; j++) { // 조건이 맞을 때까지 반복
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
