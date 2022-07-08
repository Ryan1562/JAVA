package ch07;
public class Ambulance2 extends Car2 {
	public Ambulance2(String kind, int cnt) {	setKind(kind); setCnt(cnt);	}
	void printAm() {	print();	System.out.println("환자를 태우고 간다");	}
}
class Bus extends Car2 {
	public Bus(String kind, int cnt) {	setKind(kind); setCnt(cnt);	}
	void printBus() {	print();	System.out.println("많은 승객을 싣고 달린다");	}
}

class FireEngine extends Car2 {
	public FireEngine(String kind, int cnt) {	
		setKind(kind); setCnt(cnt);	
	}
	void printFe() {
		print();
		System.out.println("물을 싣고 달린다");
	}
}