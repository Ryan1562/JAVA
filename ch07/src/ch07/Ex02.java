package ch07;
class Parent {
	int x = 100; // 200으로 변경 
	Parent() {	// 3
		this(200); 	
	}
	Parent(int x) { // 4
		this.x = x; // 5
	}
	int getX() {	return x;	}
}
class Child extends Parent {
	int x = 3000;  // 1000으로 변경
	Child() {	
		this(1000); // 1	
	} 
	Child(int x) {	
		super(); // 2 생략 된것으로 인식
		this.x = x;
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX());
	}
}