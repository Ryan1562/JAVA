package ch05;
class Car2 {
	static String color; // 클래스 변수, 정적 변수
	int displacement;    // instance 변수
	String kind;	
	void prn() {
		System.out.println("색깔 : "+color);
		System.out.println("배기량 : "+displacement);
		System.out.println("종류 : "+kind);
		System.out.println("==================");
	}
}
public class Car2Ex {
	public static void main(String[] args) {
		Car2.color = "노랑";  // 클래스를 loading할 때 초기값 셋팅
//		Car2.displacement = 1500; // instance변수는 반드시 객체를 생성해야 사용 가능
		Car2 c1 = new Car2(); Car2 c2 = new Car2();
		c1.displacement = 1500; c1.kind = "BMW"; c1.color = "파랑";
		c2.displacement = 2000;  c2.kind = "벤츠";
		c1.prn(); c2.prn();
	}
}