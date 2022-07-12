package ch08;
interface B1 {
	int K1 = 10;
	void mi();
}
interface B2 extends B1 { // interface끼리는 implements가 아니라 extends
	void m2();
}
interface B3 {	void m3();	}
interface B4 extends B2, B3 { // interface 다중상속이 가능
	void m4();
}
class B5 implements B4 { // 사용하기 위해서는 클래스로 구현해야 사용 가능
	public void m2() {	System.out.println("이건뭐야");			}
	public void mi() {	System.out.println("김건모야");			}
	public void m3() {	System.out.println("허각, 허공, 허걱");		}
	public void m4() {	System.out.println("왜불러, 배불러, 배터져");	}	
}
public class Inter2 {
	public static void main(String[] args) {
		B5 b5 = new B5();
		b5.mi(); b5.m2(); b5.m3(); b5.m4();
		System.out.println("K1 = "+B5.K1);
	}
}