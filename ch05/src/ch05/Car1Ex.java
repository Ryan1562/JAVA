package ch05;
public class Car1Ex {
	public static void main(String[] args) {
// 객체 선언 클래스명 객체명(참조변수명, 레퍼런스 변수명) = 객체 생성
		Car1 myCar = new Car1();
		myCar.color = "빨강";        // 객체명.멤버변수명; 객체명.메서드명 // 사용
		myCar.displacement = 1500;
		myCar.kind = "소나타";
		System.out.println("차 색깔 : " + myCar.color);
		System.out.println("차 배기량 : " + myCar.displacement);
		System.out.println("차 종류 : " + myCar.kind);
		myCar.speedUp();
		myCar.stop();
		
		System.out.println("=========");
		Car1 yourCar = new Car1();
		yourCar.color = "노랑";       
		yourCar.displacement = 2000;
		yourCar.kind = "말두타";
		System.out.println("차 색깔 : " + yourCar.color);
		System.out.println("차 배기량 : " + yourCar.displacement);
		System.out.println("차 종류 : " + yourCar.kind);
		yourCar.speedUp();
		yourCar.stop();
	}
}