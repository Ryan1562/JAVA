package ch08;
interface E { 
	void b1();
} 
class E1 {
	// 인터페이스를 통해서 사용하면 클래스 E2 또는 E3 각각 실행하는 메서드가 하나로 합쳐졌다
	// 실행클래스인 InterTest2와 실행하는 E2, E3클래스 연결해 주는 것인 인터페이스 E
	//   "                             "  결합도를 느슨하게 해줬다(loosely coupled)
	void m1(E d) {	d.b1();	}	
}
class E2 implements E {
	public void b1() {	System.out.println("대박");	}
}
class E3 implements E{
	public void b1() {	System.out.println("쪽박");	}
}
public class InterTest2 {
	public static void main(String[] args) {
//		E2 d2 = new E2();
		E3 d2 = new E3();
		E1 d1 = new E1();
		d1.m1(d2);
	}
}