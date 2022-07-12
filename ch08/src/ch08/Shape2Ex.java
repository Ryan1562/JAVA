package ch08;
public class Shape2Ex {
	public static void main(String[] args) {
//		Shape2 sh1 = new Shape2(); // 추상클래스 객체를 생성할 수없음
//		상속받는 자식 클래스를 만들어서 자식 클래스를 생성하여 사용, 단 선언은 가능
		Shape2[] shs = {new Circle2(), new Rectangle2(), new Triangle2()};
		for (Shape2 sh : shs) {
			sh.computeArea();
			sh.print();
		}		
	}
}