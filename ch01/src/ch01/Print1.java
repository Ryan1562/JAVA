package ch01;

public class Print1 {
	public static void main(String[] args) {
		System.out.println("대박");  // ln은 line 출력 후에 줄 바꿈
		System.out.println("사건");
		System.out.print("대박");
		System.out.println("사건");
		// %s 가격이라는 문자 %d에는 800이라는 정수를 대입
		// f가 format의 약자
		System.out.printf("%s : %d원", "가격", 800);
	}
}
