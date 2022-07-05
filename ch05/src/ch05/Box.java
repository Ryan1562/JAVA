package ch05;
public class Box {
//	객체를 생성한 후에 사용하는 변수 instance변수(멤버변수)
	public int width = 10, height, depth; // 전역변수 : 여러 메서드에서 사용 가능한 변수
	public void calVolume() {
		System.out.println("부피 : "+width * height * depth);
	}
	void square() {
		System.out.println("면적 : " + width * height);
	}
}