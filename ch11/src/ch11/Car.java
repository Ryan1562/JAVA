package ch11;
public interface Car {
	void print();
}
class Bus implements Car {
	public void print() {	System.out.println("난 버스야");	}
	void move() {		System.out.println("승객이 40명 태우고 다닌다");	}
}
class Taxi implements Car {
	public void print() {	System.out.println("난 택시야");	}
}
class FireEngine implements Car {
	public void print() {	System.out.println("난 불 자동차야");	}
}
class Ambulance {
	public void print() {	System.out.println("난 구급차야");	}
}