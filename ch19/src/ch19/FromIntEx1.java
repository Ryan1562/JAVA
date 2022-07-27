package ch19;

import java.util.stream.IntStream;

public class FromIntEx1 {
	static int sum = 0;
	public static void main(String[] args) {		
//		1 ~ 100까지 더하기
		IntStream stream = IntStream.range(1, 101); // 1 ,100 1부터100바로 앞까지 1 ~  99 1, 101=> 1 ~ 100
		stream.forEach(x ->sum+=x );
		System.out.println("합계 : "+sum );
		sum = 0;
		IntStream stream2 = IntStream.rangeClosed(1, 100); // 1,100 1부터 100까지 Closed 뒤의 값 포함
		stream2.forEach(x ->sum+=x );
		System.out.println("합계 : "+sum );
	}
}