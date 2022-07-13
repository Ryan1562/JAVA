package ch09;
import java.util.Random;
public class Random1 {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println(ran.nextInt(100)); // 0 ~ 99까지
		System.out.println(ran.nextInt(101)); // 0 ~ 100
		System.out.println(ran.nextInt(100) + 1); // 1 ~ 100
		System.out.println(ran.nextInt());    // int 정수 중에서 random
		System.out.println(ran.nextFloat());  // float실수 중에서 
 		System.out.println(ran.nextDouble()); // double   "
		System.out.println(ran.nextLong());   // long정수
		System.out.println(ran.nextBoolean()); // boolean중에서
	}
}