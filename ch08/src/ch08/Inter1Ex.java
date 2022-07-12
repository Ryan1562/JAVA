package ch08;
interface A1 { // 객체를 생성할 수 없다
	int K = 7; // 멤버변수 public static final가 생략
	void m1(); // 모든 메서드 public abstract가 생략
	void m2();
}
class A2 implements A1 { // implements 구현하다
	public void m1() {
		System.out.println("와우 ! 금요일이다");		
	}
	public void m2() {
		System.out.println("퇴실시간이 점점 가까워 지네");
	} 	
}
public class Inter1Ex {
	public static void main(String[] args) {
		A1 a1 = new A2(); // 생성은 안되지만 선언은 가능
		A2 a2 = new A2();
		a1.m1();  a2.m2();
//		a1.K = 12; 변경금지
		System.out.println("K = " + a1.K);
		System.out.println("K = " + A1.K);
	}
}