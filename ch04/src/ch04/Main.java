package ch04;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0;
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.printf("%f",a/b);
		sc.close();
	}
}