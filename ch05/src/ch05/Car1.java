package ch05;
// 모두 클래스  클래스면
public class Car1 {  // 클래스 헤더, 선언부
	String color;     // 색깔     속성(attribute) -> 멤버변수, 필드
	int displacement; // 배기량
	String kind;      // 종류
	void speedUp() {  // 기능 --> 메서드    반환형 메서드명(매개변수), void(빈) 반환할 것이 없다
		System.out.println("속도를 내고 달린다");
	}
	void stop() {  // 메서드 헤더, 메서드 선언부
		System.out.println("차를 멈춘다");  // 구현부
	}
}