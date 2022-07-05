package ch05;
class Box2 {
	int width, height, depth;
	Box2(int w) { 	width = w;	}
	Box2(int w, int h) {	width = w; height = h;	}
	Box2(int w, int h, int d) {	width = w; height = h;  depth = d;	}
	void squere() {	System.out.println("정사각형 넓이 : "+ width * width);	}
	void rectangle() {	System.out.println("직사각형 넓이 : "+ width * height);	}
	void volume() {		System.out.println("직 육면체 부피 : "+ width * height * depth);	}
}
public class Box2Ex {
	public static void main(String[] args) {
		Box2 b1 = new Box2(10); b1.squere();
		Box2 b2 = new Box2(10, 15); b2.rectangle();
		Box2 b3 = new Box2(10, 15, 20); b3.volume();
	}
}