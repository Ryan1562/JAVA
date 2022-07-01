package ch03;

public class While1 {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) { // 조건이 참이면 {}문장을 실행하고 거짓이면 종료
			System.out.println("쪽박");
			i++;  // 조건을 변경하는 부분이 없으면 무한 반복
		}
	}
}