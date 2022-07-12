package ch08;

public class CarEx {
	public static void main(String[] args) {
		Car[] car = {new Ambulance(), new Bus(), new FireEngine()};
		for (int i =0; i <car.length;i++) {
			car[i].move();
			System.out.println("x = "+ car[i].x);
			if (car[i] instanceof Bus) {
				((Bus)car[i]).inwon();
			}
		}
	}
}