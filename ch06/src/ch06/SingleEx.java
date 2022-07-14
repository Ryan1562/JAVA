package ch06;

public class SingleEx {
	public static void main(String[] args) {
		Single1 s1 = new Single1();
		Single1 s2 = new Single1();
		Single1 s3 = new Single1();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("=================");
		Single1 s4 = Single1.getInstace();
		Single1 s5 = Single1.getInstace();
		Single1 s6 = Single1.getInstace();
		
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
}
