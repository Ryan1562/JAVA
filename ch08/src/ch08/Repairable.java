package ch08;
public interface Repairable {}
class Unit {
	int hitPoint;	final int MAX_HP;
	Unit(int hp) {	MAX_HP = hp;	}
}
class GroundUnit extends Unit {
	GroundUnit(int hp) {	super(hp);	}
}
class AirUnit extends Unit {
	AirUnit(int hp) {		super(hp);	}
}
class Tank extends GroundUnit implements Repairable {
	Tank() {	super(150); 	hitPoint = MAX_HP;	}
	public String toString() {	return "Tank";	}
}
class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125); hitPoint = MAX_HP;	}
	public String toString() {		return "Dropship";	}
}
class Marine extends GroundUnit {
	Marine() {		super(40);		hitPoint = MAX_HP;	}
}