package ch19;
import java.util.Arrays;
public class AggregateEx {
	public static void main(String[] args) {
//		count의 결과는 long형
		long count = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%2==0).count();
		System.out.println("짝수의 갯수 : "+count);
		long sum = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%2==0).sum();
		System.out.println("짝수의 합 : "+sum);
		double avg = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%2==0).average().getAsDouble();
		System.out.println("짝수의 평균 : "+avg);
		int max = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%2==0).max().getAsInt();
		System.out.println("짝수 중 최대값 : "+max);
		int min = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%2==0).min().getAsInt();
		System.out.println("짝수 중 최소값 : "+min);
		int first = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%3==0).findFirst().getAsInt();
		System.out.println("3의 배수 중 첫번째 값 : "+first);
	}
}