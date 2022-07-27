package ch18;
@FunctionalInterface  // 이 인터페이스가 함수적 인터페이스인 확인
interface MyFunction1 {
	void method1();
}
class MyFunctionCl implements MyFunction1 {
	public void method1() {
		System.out.println("재정의한 메서드");
	}	
}
public class Lamda1Ex {
	public static void main(String[] args) {
		MyFunction1 mf1; // = new MyFunction1(); // 인터페이스는 객체를 생성할 수 없다
		mf1 = new MyFunctionCl();  // 1. 인터페이스를 구현한 클래스를 이용하여 객체 생성
		mf1.method1();
		mf1 = new MyFunction1() { // 익명(무명) 클래스 를 이용한 객체 생성
			public void method1() {
				System.out.println("익명 클래스로 정의한 메서드");
			}
		};
		mf1.method1();
//		() 함수 즉 method1()
		mf1 = ()-> { System.out.println("람다로 구현한 메서드"); };
		mf1.method1();
	}
}