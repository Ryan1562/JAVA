package ch04;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] coinUnit = {500, 100, 50, 10};
		int money = 0;
		System.out.print("거스름돈 : ");
		money = sc.nextInt();
				
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.printf(coinUnit[i] + "원 : " + money/coinUnit[i] +"개\n");
			money = money%coinUnit[i];
		}
	}
}