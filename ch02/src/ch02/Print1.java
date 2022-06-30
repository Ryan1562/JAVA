package ch02;

public class Print1 {
	public static void main(String[] args) {
		System.out.printf("%d\n", 16);      // 16출력
		System.out.printf("%5d\n", 16);     // 5칸확보 16출력(뒤부터 채움)
		System.out.printf("%-5d\n", 16);    // 5칸확보 16출력(앞부터 채움)
		System.out.printf("%05d\n", 16);    // 5칸확보 16출력(빈칸은 0으로 채움)
	}
}