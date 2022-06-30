package ch02;
public class Tri1 {
	public static void main(String[] args) {
		int i1 = 7;
//		              조건, 식       맞으면   아니면
		String b1 = (i1 % 2 == 0)? "짝수" : "홀수";
		System.out.printf("%d는 %s입니다", i1, b1);
	}
}