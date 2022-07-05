package test;
// import Box라는 클래스는 ch05패키징에 있는 Box
import ch05.Box;
public class Cal2Ex {
	public static void main(String[] args) {
//		같은 패키지에 있는 클래스가 아닌 경우 패키지명.클래스으로 사용한다
//		ch05.Box b1 = new ch05.Box();  
		Box b1 = new Box();  // 반드시 객체를 생성해야 사용 가능
		b1.width = 20; b1.height = 25; b1.depth = 15;
		b1.calVolume();
		
//		public 있어야 다른 패키지에서도 사용 가능
//		Cal c1 = new Cal(); 
//		c1.x = 15;
//		c1.y = 4;
//		c1.cal();
	}
}