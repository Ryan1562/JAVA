package ch04;

public class Ex04 {
	public static void main(String[] args) {
		// 거슬름돈 372000을 50000권 몇장, 10000권 몇장, 5000권 몇장 1000권 몇장
		int money = 372000;
		int[] unit = {50000, 10000, 5000, 1000}; // 5만 7, 1만 2, 5천 0, 천 2
		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d원짜리 %d장\n", unit[i], money/unit[i]);
			money %= unit[i];
		}
	}
}