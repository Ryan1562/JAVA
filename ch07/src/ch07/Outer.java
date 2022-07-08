package ch07;
public class Outer {
	private int height;
	private int width;
	public Outer(int height, int width) {
		this.height = height; this.width = width;
	}
	public Inner getInner() {
		return new Inner();
	}
//	클래스 안에 있는 클래스 : Inner, 중첩, 내부
//	밖에 있는 변수, 메서드를 자기 것처럼 사용 가능
//	컴파일 Outer.class와 Outer$inner.class 두개가 생성
	class Inner { // 클래스 안에 있는 클래스
		private float rate = 0.5f;
		public float volume() {
			return rate * height * width;
		}
	}
}