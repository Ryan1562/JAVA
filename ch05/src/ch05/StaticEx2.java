package ch05;
class Static2 {
	int num1;         // 초기값 0
	static int num2;  // 값이 변경되면 변경된 값이 남아있다
	void print() {
		System.out.println("num1 = "+ ++num1+", num2 = "+ ++num2);
	}
}

public class StaticEx2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			Static2 st1 = new Static2(); // new 새로운 객체를 생성
			st1.print();
		}
	}
}