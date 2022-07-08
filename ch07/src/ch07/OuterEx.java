package ch07;

public class OuterEx {
	public static void main(String[] args) {
		Outer out = new Outer(10, 15);
		Outer.Inner inner1 = out.new Inner(); // 객체에 new
		Outer.Inner inner2 = out.getInner();  // 메서드를 통하여 생성
		
		System.out.println("부피 : "+inner1.volume());
		System.out.println("부피 : "+inner2.volume());
	}
}