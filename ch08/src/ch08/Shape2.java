package ch08;
// 메서드 중에 하나라도 추상 메서드가 있으면 추상클래스여야 한다
public abstract class Shape2 {
	void print() { // 일반 메서드  선언부
		System.out.println("대박 사건"); // 구현부
	}
	abstract void computeArea(); // 선언부만 있고 구현부가 없는 메서드
}
class Circle2 extends Shape2 {
	void computeArea() { // 추상메서드 반드시 재정의 해야한다
		System.out.println("원의 면적 : 3.14 * 반지름 * 반지름");
	}	
}
class Rectangle2 extends Shape2 {
	void computeArea() {
		System.out.println("사각형의  면적 : 가로 * 세로");		
	}	
}
class Triangle2 extends Shape2 {
	void computeArea() {
		System.out.println("삼각형의  면적 : 가로 * 세로 / 2");		
	}	
}