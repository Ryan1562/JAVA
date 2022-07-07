package ch06;
class Car1 {
	// this 객체, instance것으라는 의미
	String color;
	int displacement;
	String kind;
	Car1(String color, int displacement, String kind) { // 프로그램 이해에 도움
		this.color= color;  this.displacement = displacement; this.kind = kind;
	}
	void prn() {
		System.out.println("색깔 : " + this.color);  
		System.out.println("배기량 : " + displacement); // this가 생략
		System.out.println("종류 : " + kind);
		System.out.println("===============");
	}
}
public class Car1Ex {
	public static void main(String[] args) {
		Car1 c1 = new Car1("빨강",1500, "소나타");
		c1.prn();
		Car1 c2 = new Car1("노랑",3500, "벤츠");
		c2.prn();
	}
}