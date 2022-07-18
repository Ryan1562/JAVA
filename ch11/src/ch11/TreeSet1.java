package ch11;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class TreeSet1 {
	public static void main(String[] args) {
//		Scanner통해서 몇개의 고정된 lotto번호가 들어 가도록 조작
		Scanner sc = new Scanner(System.in);
		Set<Integer> lotto = new TreeSet<>();
		System.out.println("몇개의 번호를 고정할 까요 ?");
		int cnt = sc.nextInt();
		while (lotto.size() < cnt) {
			System.out.println("번호를 뭘로 할까요 ?");
			int num = sc.nextInt();
			if (num > 45 || num < 1) System.out.println("로또 번호로 타당하지 않습니다");
			else lotto.add(num);
		}
//		중복도 막고 순서대로 정열
		while (lotto.size() < 6) {
//			            (정수) 0 ~ 1사이의 실수 0 ~ 44까지 실수 => 정수
			int num = (int) (Math.random() * 45) + 1; // 1 ~ 45
			lotto.add(num);
		}
		System.out.println(lotto);
		sc.close();
	}
}