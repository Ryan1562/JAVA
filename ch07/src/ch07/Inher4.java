package ch07;

public class Inher4 {
	public static void main(String[] args) {
		D3 d3 = new D3();
//		d3 할아버지, 아버지의 변수와 메서드를 자기것철 사용 가능
		System.out.println("st1 = "+d3.st1);
		System.out.println("st2 = "+d3.st2);
		System.out.println("st3 = "+d3.st3);
		
		d3.m1();  d3.m2();  d3.m3();
	}
}
