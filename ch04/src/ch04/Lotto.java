package ch04;
import java.util.Arrays;  // 0   1  2   3
import java.util.Scanner; // 3, 17, 43  32
public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		System.out.println("로또번호 몇개를 조작할 까요");
		int num = sc.nextInt();
		for(int i =0; i < num ; i++) {
			System.out.println("로또 번호를 입력하세요");
			lotto[i] = sc.nextInt();
			for (int j = i - 1; j >= 0; j--) { // j =1
				if (lotto[i] == lotto[j]) { // 새로 입력한 로또 번호가 앞에 이미 존재하면
					i--;       // 새로 입력한 로또 번호 취소 => 그 번호를 다시 추첨
					break;
				}
			}
		}
		int imsi = 0;
		for (int i = num; i < lotto.length; i++) {
	//	for (int i = 0; i < lotto.length; i++) {  34 45 34
//		           (int)0.00000...1 ~ 44.99999 => 0 ~ 44 + 1 => 1 ~ 45
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = i - 1; j >= 0; j--) { // j =1
				if (lotto[i] == lotto[j]) { // 새로뽑은 로또 번호가 앞에 이미 존재하면
					i--;       // 새로 뽑은 로또 번호 취소 => 그 번호를 다시 추첨
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					imsi = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = imsi;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		sc.close();
	}
}