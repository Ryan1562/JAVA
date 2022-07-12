package ch08;
import pac.One;
public class OneEx extends One {
	public static void main(String[] args) {
//		다른 패키지의 변수나 메서드도 상속 받은 경우에는 protected나 public으로 사용 가능하다
//		default나 private은 사용 못함
		OneEx a = new OneEx();		
		System.out.println(a.getOne());
		System.out.println(a.one);
	}
}