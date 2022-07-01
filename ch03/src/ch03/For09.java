package ch03;

public class For09 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {  // 1번 변화면
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) { // 조건이 맞을 때까지 반복
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
