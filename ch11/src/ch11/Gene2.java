package ch11;
import java.util.ArrayList;
public class Gene2 {
	public static void main(String[] args) {
//		Car를 상속받거나 구현한 클래스만 추가 가능
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Bus()); 		list.add(new Taxi());
		list.add(new FireEngine()); // list.add(new Ambulance()); // Car를 구현하지 않했다
		for(Car car:list) {
			car.print();
			if (car instanceof Bus)
				((Bus)car).move();
		}
	}
}