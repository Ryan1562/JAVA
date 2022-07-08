package ch07;
public class Car3Ex {
	public static void main(String[] args) {
//		FireEngine3 fe = new Car3(); // 자식을 선언하고 부모를 생성해서 넣을 수 없다 down-casting
		Car3 car1 = new FireEngine3(); // 부모를 선언하고 자식을 대입하는 것은 up-casting 묵시적
		Car3 car2 = new Ambulance3();  
		Car3 car3 = new Bus3();
//		부모를 선언하고 자식을 대입했을 경우에는 부모에 있는 메서드만 사용 가능하다
//		실제로 실행되는 메서드는 자식 메서드
		car1.drive(); car2.drive(); car3.drive(); // car1.fire()
		System.out.println("=========================");
		Car3[] cars = {car1, car2, car3}; // 부모 클래스의 배열형식으로 처리할 수 있다
		for(Car3 car : cars) {
			car.drive();
		}
		System.out.println("=========================");
		for(int i =0; i < cars.length;i++) {
			cars[i].drive(); // 실제로 실행되는 메서드는 자식메서드, 부모에 메서드와 이름이 같은 메서드만 실행 가능
			System.out.println("색깔 : " + cars[i].color); // 변수는 부모것으로 실행
//			지금 사용하려는 care[i]가 원래 FireEngine3에서 생성된 것이면
			if (cars[i] instanceof FireEngine3) { // true일 때만 실행
				((FireEngine3)cars[i]).fire();    // down-casting 형변환
			}			
		}
	}
}