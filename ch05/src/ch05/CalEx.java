package ch05;
class Cal {
	int x =0, y = 0;
	public void cal() {
		System.out.println("연산결과");
		System.out.printf("%d + %d = %d\n", x, y, x + y);
		System.out.printf("%d - %d = %d\n", x, y, x - y);
		System.out.printf("%d * %d = %d\n", x, y, x * y);
		System.out.printf("%d / %d = %d\n", x, y, x / y);
	}
}
// 한 파일에 두개의 클래스 같이 사용할 때 main에 있는 클래스명과 파일명이 일치하고 public
// JVM 진입하는 메서드는 main
public class CalEx {
	public static void main(String[] args) {
		Cal c1 = new Cal(); Cal c2 = new Cal(); Cal c3 = new Cal();
		c1.x = 10; 	c1.y = 20;
		c2.x = 12; 	c2.y = 4;
		c3.x = 15; 	c3.y = 5;
		c1.cal(); c2.cal(); c3.cal();
	}
}