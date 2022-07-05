package ch05;
class Car4 {
	String carNo; // 차량번호
	int inTime;   // 입고시간
	int outTime;  // 출고시간
	int fee;      // 주차요금
	final int MONEY_PER_HOUR = 5000; // 시간다 주차요금
	Car4(String cNo, int it ,int ot) { // 멤버년수 초기화
		carNo = cNo; inTime = it; outTime = ot;
	}
	void calFee() { // 요금계산
		fee = (outTime - inTime ) * MONEY_PER_HOUR;
	}
	void prn() {
		System.out.println("차량번호 : "+carNo);
		System.out.println("입고시간 : "+inTime);
		System.out.println("출고시간 : "+outTime);
		System.out.println("주차요금 : "+fee);
		System.out.println("==================");
	}
}
public class Car4Ex {
	public static void main(String[] args) {
		Car4 car1 = new Car4("가1234", 10, 13); 
		Car4 car2 = new Car4("나4567", 9,  18);
		Car4 car3 = new Car4("다9876", 11, 16);
		Car4[] cars = {car1, car2, car3};
		for(Car4 car : cars) {
			car.calFee(); car.prn();
		}
//		car1.calFee(); car2.calFee(); car3.calFee();
//		car1.prn(); car2.prn(); car3.prn();
	}
}




