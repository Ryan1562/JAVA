package ch05;

public class Cal2Ex {
	public static void main(String[] args) {
		Box b1 = new Box();  // 반드시 객체를 생성해야 사용 가능
		b1.width = 20; b1.height = 25; b1.depth = 15;
		b1.calVolume();
		
		Cal c1 = new Cal();
		c1.x = 15;
		c1.y = 4;
		c1.cal();
	}
}