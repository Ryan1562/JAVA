package ch10;
public class Except3 {
	public static void main(String[] args) {
		int[] x = {12, 45,25,0, 6};
		for(int i = 0; i <= x.length;i++) {
			try {
				System.out.printf("%d / %d = %d\n", 100, x[i], 100/x[i]);
			}catch (ArithmeticException e) {
				System.out.println("영으로 못 나눕니다");
			}catch (ArrayIndexOutOfBoundsException e) { // 인덱스 범위를 벗어났다
				System.out.println("인덱스 범위를 벗어났다");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				System.out.println("에외 발생여부와 관계없이 무조건 실행");
			}
		}
	}
}