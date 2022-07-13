package ch10;

public class Throw1 {
	public static void main(String[] args) {
		System.out.println("대박");
		try {
//			개발자가 임의로 에러 발생시킨다
//			테스트 용으로 사용
			throw new Exception("헐 ~");
		}catch (Exception e) {
			System.out.println("에러 : "+e.getMessage());
		}
	}
}