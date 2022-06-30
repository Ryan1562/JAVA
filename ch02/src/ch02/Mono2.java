package ch02;

public class Mono2 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 7;
//		k1     = 5 * 6 + (2+7)*3=> 30+9*3=>30+27=> 57 
//		i2를 1감소
		int k1 = 5 * ++i1 + (2+ i2--) * 3;
//		i1, i2, k1 출력
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("k1 = " + k1);
	}
}