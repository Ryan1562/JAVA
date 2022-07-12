package ch08;
public class Shape {
	void draw() {}
}
class Circle extends Shape {
	public void draw() { // 부모의 메서드 내용을 재정의(변경)
		System.out.println("원을 그린다");
	}
}
class Rectangle extends Shape {
	public void draw() {
		System.out.println("사각형을 그린다");
	}
}
class Triangle extends Shape {
	public void draw() { // overriding
		System.out.println("삼각형을 그린다");
	}
}