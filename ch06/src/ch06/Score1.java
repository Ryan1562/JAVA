package ch06;
public class Score1 {
	public Score1() {
		this("로제"); // this() 생성자의 첫째줄, 생성자를 호출하여 실행하고 다시 이자로 돌아옴
		System.out.println("매개변수가 없는 생성자");
	}
	public Score1(String name) {
		this("로제", 90); // 같은 생성자 중에 매개변수가 일치하는 생성자 호출
		System.out.println("매개변수가 이름 "+name);
	}
	public Score1(String name, int kor) {
		System.out.println("매개변수가 이름 "+name+", 국어 : "+kor);
	}
	void print() {
		System.out.println("고뤠");
	}
	public static void main(String[] args) {
		Score1 sc = new Score1();
		sc.print();
	}
}