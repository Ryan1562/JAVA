package ch03;

public class Break2 {
	public static void main(String[] args) {
		k1 : for (int i = 1; i <= 10; i++) { // k1 label
			for (int j= 1; j <= 10; j++) {
				System.out.print("대박 ");
				if (j > 4) break k1; // k1 label로 반복문을 종료
			}
			System.out.println("사건 : "+i);
		}
	}
}
