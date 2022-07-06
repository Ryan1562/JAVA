package ch05;

public class InitialBlock1 {
	int i1;
	int i2;
	static int i3;
//	i1 = 10; // 실행문은 메서드 안에서 사용
	{   // 인스탄스 초기화 블럭, 초기화 블럭에서는 실행문 사용 가능
		i1 = 10;
		i2 = 20;
	}
	static { // 클래스 초기화 블럭
		i3 = 30;
	}
}