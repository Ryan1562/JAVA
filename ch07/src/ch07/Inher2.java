package ch07;
class B {
	int age = 20; 
	void b() { 	System.out.println("대박");	}
}

class B1 extends B { 
	String hobby = "욕하기";
	void b1() {	System.out.println("덥다. 더워");	}
}

class B2 extends B { 
	String part = "화장실 청소";
	void b2() {  System.out.println("허걱 ~ 즐 ~");  }
}

public class Inher2 {
	public static void main(String[] args) {
		B1 b1 = new B1();		 // B + B1의 멤버변수와 메서드
		System.out.println("나이 : " + b1.age);
		System.out.println("취미 : " + b1.hobby);		
		b1.b();   b1.b1();		
		B2 b2 = new B2();		// B + B2의 멤버변수와 메서드
		System.out.println("나이 : " + b2.age);
		System.out.println("담당 : " + b2.part);		
		b2.b();  b2.b2();
	}
}




