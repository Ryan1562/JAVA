package ch08;
interface Bird {
	void eat(); // 부리로 쪼아 먹는다
}
// implements뒤에는 여러개의 인터페이스를 사용할 수 있다 
public class Monster extends Person2 implements Fish, Bird{ // Person2상속, Fish, Bird 구현
	public void eat() {
		System.out.println("부리로 쪼아 먹는다");		
	}
	public void swim() {
		System.out.println("물속에서 장시간 헤엄친다");				
	}
}