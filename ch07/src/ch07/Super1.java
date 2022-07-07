package ch07;
class E1 {
	int k1 = 7;
	E1() {	System.out.println("매개변수 없는 생성자");	}
	E1(String str) {
		this();
		System.out.println("매개변수 하나 : " + str);
	}
}

class E2 extends E1 {
	E2() {	
//		super(매개변수); // 매개변수 갯수와 데이터형이 일치하는 부모 생성자를 호출
		super("너야");  // 이게 없으면 부모의 default생성자가 실행되는데
					   // 이것 때문에 부모의 매개변수가 하나인 생성자가 호		
		System.out.println("매개변수 없는 자식");
	}
}

public class Super1 {
	public static void main(String[] args) {
		E2 e2 = new E2();
		System.out.println("k1 = " + e2.k1);
	}
}