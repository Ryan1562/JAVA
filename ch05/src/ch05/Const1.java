package ch05;
class A { // 생성자 오버로딩 : 매개변수의 갯수가 다르거나 데이터형이 다른 경우
	public A() {	System.out.println("매개변수가 없는 생성자");	}
	public A(int k) {	System.out.println("매개변수가 1개인 생성자 : " + k);	}
//	public A(int a) { // 매개변수의 갯수가 같고 데이터형이 같으면 같은 생성자로 인식
//		System.out.println("매개변수가 1개인 생성자 : " + a);
//	}
	public A(String k) {	System.out.println("매개변수가 1개인 생성자 : " + k);	}
	public A(int k1, String k2) {
		System.out.println("매개변수가 2개인 생성자 : " + k1+", k2 = "+k2);
	}
}

public class Const1 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(12);
		A a3 = new A("대박");
		A a4 = new A(7, "헐 ~");
	}
}