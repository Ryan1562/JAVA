package ch07;
class A {
	int a = 10;
	void m1() {	System.out.println("난 부모 메서드");	}
}
class A1 extends A {  // A의 멤버변수와 메서드를 재 사용효과
	int a1 = 12;
	void m2() {	System.out.println("난 자식 메서드");	}
}
class A2 extends A { // 상속 : 부모의 멤버변수와 메서드를 자기 것으로 사용
	int a2 = 77;
	void m3() {	System.out.println("난 m3메서드");	}
}
public class Inher1 {
	public static void main(String[] args) {
		A a = new A();		a.m1();		System.out.println("a.a = "+a.a);
		A1 a1 = new A1();		a1.m1(); a1.m2();		System.out.println("a1.a = "+a1.a);
		System.out.println("a1.a1 = "+a1.a1);
		A2 a2 = new A2();
		a2.m1(); a2.m3(); 
		System.out.println("a2.a = " + a2.a);
		System.out.println("a2.a2 = " + a2.a2);
	}
}