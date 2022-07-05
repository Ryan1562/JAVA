package ch05;
public class Final1Ex {
	public static void main(String[] args) {
		final double PI = 3.14; // final 마지막, 변경 못함, 변수명을 모두 대문자로 사
		int r = 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %.2f\n", r, r * r * PI);
		r = 20;
//		PI = 3.141592;  // final 변수는 수정 못함
		System.out.printf("반지름이 %d인 원의 넓이 : %.2f\n", r, r * r * PI);
	}
}
