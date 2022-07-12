package ch08; 
class Person2 {
	int leg = 2;
	void move() {
		System.out.println("두 다리로 걷는다");
	}
}
interface Fish {
	void swim();
}
public class Mermaid extends Person2 implements Fish { // 다중 상속 지원
	public void swim() {
		System.out.println("물속에서 장시간 헤엄친다");	
	}
	public static void main(String[] args) {
		Mermaid mr = new Mermaid();
		mr.move();
		mr.swim();
		System.out.println("다리 갯수 : " + mr.leg);
	}
}