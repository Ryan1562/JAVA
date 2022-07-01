package ch03;
public class MathRan1 {
	public static void main(String[] args) {
		// Math.random() : 0 ~ 1미만의 실수를 임의로 생성
		// Math.random() * 100 : 0 ~ 100미만의 실수
		// (int)(Math.random() * 100) : 0 ~ 100미만의 정수
		// (int)(Math.random() * 100) + 1: 1 ~ 100사이의 정수
		System.out.println((int)(Math.random() * 100) + 1);
	}
}