package ch18;
//@FunctionalInterface  // 함수적 인터페이스인지 체크
interface MyFun2 {
	void method(int x);
}
public class Lamda2Ex {
	public static void main(String[] args) {
		MyFun2 mf;
		mf = (x) -> {
			int result = x * 5;
			System.out.println("결과 : "+result);
		};
		mf.method(10);
		mf = (x)-> { System.out.println("결과 : "+x*7); };
		mf.method(7);
//		매개변수가 한개인 경우에는 소괄호()를 생략할 수 있다
		mf = x-> { System.out.println("결과 : "+x*5); };
		mf.method(5);
//		실행문이 한개인 경우에는 중괄호{}를 생략할 수 있다
		mf = x->  System.out.println("결과 : "+x*6);
		mf.method(6);
	}
}