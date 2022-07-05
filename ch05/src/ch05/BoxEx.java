package ch05;

public class BoxEx {
	public static void main(String[] args) {
		Box box1 = new Box();
//		box1.width = 20;    // 값을 저장하지 않으면 초기값 10을 사용
		box1.height = 25;
		box1.depth = 50;
		box1.calVolume();
		box1.square();

		Box box2 = new Box();
		box2.width = 12;   // 값을 주면 초기값을 무시하고 12로 변경
		box2.height = 20;
		box2.depth = 25;
		box2.calVolume();
		box2.square();
	}
}