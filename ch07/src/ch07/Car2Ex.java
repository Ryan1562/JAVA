package ch07;

public class Car2Ex {
	public static void main(String[] args) {
		Bus bus = new Bus("버스", 40);
		Ambulance2 am = new Ambulance2("구급차", 6);
		FireEngine fe = new FireEngine("불자동차", 10);
		
		bus.printBus();
		am.printAm();
		fe.printFe();
	}
}
