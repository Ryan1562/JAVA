package ch06;

public class Single1 {
//	static은 객체를 생성하지 않고 사용 가능
//	멤버변수에 붙은 경우에는 클래스를 사용하기 위해 loading할 때 실행(객체생성할 때는 실행 안함)
	private static Single1 instance = new Single1();
	Single1() {	}  // 생성자를 private로 변경. 다른 클래스에서 호출 못하게
	
//	public이므로 외부에서 호출 가능하므로 이 메서드를 통하여 객체 생성
	public static Single1 getInstace() {
		return instance;
	}
}