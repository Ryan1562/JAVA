package ch07;
public class H1 {
	int x;   // 34
	H1(int x) {   // 7
		this.x = x; // x = 34
		System.out.println("부모 생성자 매개변수 1개 : "+x);  // 8
	}
	H1(int x, int y) { // 5
		this(x);       // 6
		System.out.println("x = "+x);   // 9
	}
	void print() {	
		System.out.println("x = " + x);
	}
}
class H2 extends H1 {
	H2(int x, int y) { // 3
		super(x, y);   // 4
		System.out.println("자식 생성자 매개변수 2개");  // 10
	}
//	      34     45     67
	H2(int x, int y, int z) {  // 1 
		this(x, y);   // 2
		System.out.println("매개변수 3개");  // 11
	}
}
