package ch06;
// overloading 메서드명이 같은데 데이터형이 다르거나 매개변수의 갯수가 다른 것
class D3 {
	void add(int x, int y) {	System.out.printf("%d + %d = %d\n", x, y, x+y);	}
	void add(double x, double y) {	System.out.printf("%.1f + %.1f = %.1f\n", x, y, x+y);	}
	void prn(String name) {		System.out.println(name);	}
	void prn(int k) {			System.out.println(k);	}
	void prn(String name, int age) {	System.out.println("이름 : "+name+", 나이 : " + age);	}
}
public class OverLoading1 {
	public static void main(String[] args) {
		D3 d = new D3();
		d.add(5, 6); 
		d.add(3.6, 7.5);
		d.prn("로제");
		d.prn(67);
		d.prn("철수", 54);
	}
}