package ch06;
class A2 {
	void reamin(int x, int y) {  // 선언부
		System.out.printf("%d %% %d = %d\n", x, y, x%y);  // 구현부
	}
}
public class Add2 {
	static double add(double x, double y) { // 메서드 선언부
		return x + y;
	}
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.reamin(25, 7);
//		실수의 연산은 근사값
		System.out.println(add(12.5, 56.3));
		double d1 = add(7.5, 56.2); // 데이터형은 반환형과 같아야 한다
		System.out.println(d1);
	}
}