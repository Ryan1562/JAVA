package ch08;
interface C1 {
	String STR = "와우 마지막 시간이닷";
	void c1();
}
interface C2 extends C1 {	void c2();	}
interface C3 extends C2 {	void c3();	}
class C4 implements C3 {
	public void c2() {		System.out.println("판딸기");		}
	public void c1() {		System.out.println("산딸기");		}
	public void c3() {		System.out.println("알카리딸기");	}
	public void c4() {		System.out.println("뱀딸기");		}
}

public class Inter3 {
	public static void main(String[] args) {
		C4 c4 = new C4();
		c4.c1(); c4.c2(); c4.c3(); c4.c4();
		System.out.println("str = "+C4.STR);
	}
}