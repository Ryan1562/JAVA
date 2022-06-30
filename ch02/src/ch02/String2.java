package ch02;

public class String2 {
	public static void main(String[] args) {
		System.out.println(2+0+2+2+"년도");
//		년도 : 2 +숫자 0이 문자로 변경 => 년도 : 20+숫자 2를 만나면 숫자2가 문자로 2
//		범위가 다른 데이터형의 연산은 범위가 큰 쪽으로 변경
		System.out.println("년도 : "+2+0+2+2);
	}
}