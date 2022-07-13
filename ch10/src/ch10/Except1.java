package ch10;
public class Except1 {
	public static void main(String[] args) {
		int number = 100, result = 0;
		for(int i =0; i< 10; i++) {
			try {
//				나눗셈을 시도하다가 
				result = number / (int)(Math.random()*10);
			}catch (ArithmeticException e) { // 수학적인 예외가 발생하면 잡아서 처리해
				System.out.println("0으로 못나눠");
			}
			System.out.println("나눗셈 결과 : "+result);
		}
	}
}