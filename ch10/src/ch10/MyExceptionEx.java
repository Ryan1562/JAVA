package ch10;

public class MyExceptionEx {
	public static void main(String[] args) {
		try {
			throw new MyException("대박");
		}catch (Exception e) {
			System.out.println("헐 예외 : "+e.getMessage());
		}
	}
}