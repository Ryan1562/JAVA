package ch05;
class Static1 {
	int var1 = 100;  // 객체를 생성해야 사용 가능
	static int var2 = 200; // 클래스 변수, 클래스를 로딩하자마자 바로 사용
	void prn1() { // 객체를 생성해야 사용 가능
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
	}
	static void prn2() {  // 클래스 메서드 객체를 생성하지 않고 바로 가능한 메서드,  클래스를 로딩하자마자 바로 사용
//      클래스 메서드는 instance변수를 사용할 수 없다
//		System.out.println("var1 = " + var1); // 객체가 생성되지 않은 상태에서 사용 못하는 변수
		System.out.println("var2 = " + var2);
	}
}

public class Static1Ex {
	public static void main(String[] args) {
		Static1.prn2(); // 클래스 메서드는 객체를 생성하지 않고 바로 사용 가능
//		Static1.prn1(); // instance메서드를 객체를 생성한 후에 사용 가능
		Static1 s1 = new Static1();
		s1.prn1();
		s1.prn2();
	}
}