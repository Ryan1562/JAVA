package ch08;

public class MonsterEx {
	public static void main(String[] args) {
		Monster mt = new Monster();
		mt.eat();
		mt.move();
		mt.swim();
		System.out.println("다리 갯수 : " + mt.leg);
	}
}