package ch02;

public class Mono1 {
	public static void main(String[] args) {
		int i1 = 5, i2= 5;  // 데이터형이 같을 때 하나의 데이형을 쓰고 변수두개 선언 및 대입 가능
//		int i3 = 7, double d1 =3.5;
//		i1++ 현재값을 출력하고 나서 1증가, ++i2 1증가 후에 출력
		System.out.println("i1 = "+ i1++ +", i2 = "+ ++i2);
		System.out.println("i1 = "+ i1 +", i2 = "+ i2);
//		i1-- 현재값을 출력하고 나서 1감소, ++i2 1감소 후에 출력
		System.out.println("i1 = "+ i1-- +", i2 = "+ --i2);
		System.out.println("i1 = "+ i1 +", i2 = "+ i2);
	}
}