package ch06;
class D2 {
//	참조형 변수 객체, 배열 callByRef 주소 전달 : 서로 영향을 미침
//	기본형 변수 값 정수, 실수, 문자, bool형 값 전달 : 무관
	int x, y;
	void swap(D2 d) {
		int imsi = d.x;
		d.x = d.y;
		d.y = imsi;
		System.out.println("swap x = " + d.x);
		System.out.println("swap y = " + d.y);
	}	
}
public class CallByRef2 {
	public static void main(String[] args) {
		D2 d2 = new D2();
		d2.x = 10; d2.y = 20;
		d2.swap(d2);
		System.out.println("main x = " + d2.x);
		System.out.println("main y = " + d2.y);
	}
}
