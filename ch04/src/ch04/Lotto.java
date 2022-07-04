package ch04;
import java.util.Scanner;
public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = i - 1; j >= 0; j--) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		sc.close();
	}
}