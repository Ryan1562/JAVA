package ch07;

public class Inher3 {
	public static void main(String[] args) {
		C3 c3 = new C3(); // C1() ---> C2() ---> C3()
		System.out.println("c3.c1 = "+c3.c1);
		System.out.println("c3.c2 = "+c3.c2);
		System.out.println("c3.c3 = "+c3.c3);
		c3.c11();  c3.c21();  c3.c31();
	}
}