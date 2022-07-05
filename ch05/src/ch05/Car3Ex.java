package ch05;
class Car3 {  // 모든 클래스는 생성자를 가지고 있음, 생성자가 없는 경우에는 컴파일러가 default생성자를 만들어준다
//	default(기본) 생성자란 ? 매개변수가 없고 구현문이 없는 생성자
	String color;
	int displacement;
	String kind;
	Car3() {}  // 생성자, 메서드와 유사한 모양이지만 반환형이 없음
//	생성자가 여러개일 경우에는 매개변수의 갯수가 다르거나 데이터형이 달라야 한다, 생성자 overloading
	Car3(String c, int d, String k) { // 이름이 클래스와 일치
		color = c;  displacement = d;  kind = k;
	}
	void prn() {
		System.out.println("색깔 : "+color);
		System.out.println("배기량 : "+displacement);
		System.out.println("종류 : "+kind);
		System.out.println("=========================");
	}
}
public class Car3Ex {
	public static void main(String[] args) {
		Car3 car1 = new Car3(); // 객체를 생성
		car1.color = "빨강"; car1.displacement = 2000; car1.kind = "BMW"; 
		car1.prn();
		Car3 car2 = new Car3("파랑", 2500, "벤츠"); // 객체를 생성 (매개변수)
		car2.prn();
		Car3 car3 = new Car3("노랑", 3000, "아우디"); // 객체를 생성 (매개변수)
		car3.prn();
	}
}