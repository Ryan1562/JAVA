package ch03;
public class While5 {
	public static void main(String[] args) {
		System.out.println(" 구구단");
		System.out.println("========");
		int i = 1, j = 2;
		while(i <= 9) { // 중첩 while i 1  2  3
			while(j <= 9) { // j  2  3  4..    9  10
				System.out.printf("%d * %d = %d\t",j,i,i*j);
				j++;  
			}
			System.out.println(); // 줄바꿈
			i++;
			j = 2;
		}
	}
}