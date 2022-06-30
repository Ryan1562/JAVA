package ch02;

public class Area {
	public static void main(String[] args) {
		double p1 = 3.141592;
		int r1 = 10;
//		연산의 결과는 범위가 큰쪽 형을 따른다
		double area = p1 * r1;
//		p1 * r1 = area로 출력
		System.out.println(p1+" * "+r1+" = "+area);
//		%d 정수 %f 실수  %s 문자열
		System.out.printf("%f * %d = %f", p1, r1,area);
	}
}
