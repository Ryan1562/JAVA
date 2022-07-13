package ch10;
public class Throws1 {
	public static void main(String[] args) {
		for(int i =0; i < 5; i++) {
			try {
				m1(i);
			}catch (ArithmeticException e) {
//				System.out.println("영으로 못나눠");
//				System.out.println(e.getMessage());
				e.printStackTrace(); // 예외가 발샐한 흔적을 추적해서 출석
			}
		}
	}
	private static void m1(int i) throws ArithmeticException {
			m2(i);		
	}
	// throws사용 이 메서드를 호출한 곳에서 처리, 즉 m1()에서 처리
	private static void m2(int i) throws ArithmeticException { 
		int  k = 12;
		System.out.printf("%d / %d = %d\n", k, i, k/i);	
	}
}