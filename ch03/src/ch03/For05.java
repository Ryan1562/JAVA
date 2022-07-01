package ch03;

public class For05 {
	public static void main(String[] args) {
		System.out.println(" 구구단 ");
		System.out.println("=======");
		for(int i = 1; i<= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j+" * "+i+" = "+i*j+"\t");
//				System.out.printf("%d * %d = %d\t", j, i, i*j);
			}
			System.out.println();
		}
	}
}