package ch07;
public class CarEx {
	public static void main(String[] args) {
		Engine eg1 = new Engine(2000, "GDI");
		Engine eg2 = new Engine(2500, "DOHC");
		
		Car c1 = new Car(eg1, "빨강");
		Car c2 = new Car(eg1, "파랑");
		Car c3 = new Car(eg2, "초록");		
		c1.print(); c2.print(); c3.print();
		System.out.println("-------------------------");
		
		Car[] cars = {c1, c2,c3};
		for (Car car : cars) {
			car.print();
		}
	}
}