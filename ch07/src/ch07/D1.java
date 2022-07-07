package ch07;
public class D1 {
	String st1 = "허걱";
	D1() {	System.out.println("내가 보스");	}
	void m1() {	System.out.println("내가 첫번째 메서드");	}
}

class D2 extends D1 {
	String st2 = "허공";
	D2() {	System.out.println("난 넘버 2");	}
	void m2() {	System.out.println("두번째 메서드");	}
}

class D3 extends D2 {
	String st3 = "헐 ~";
	D3() {	System.out.println("난 막내");	}
	void m3() {
		System.out.println("난 막내 메서드");
	}
}