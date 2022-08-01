package ch19;
import java.util.Arrays;
public class MatchEx {
	public static void main(String[] args) {
		int[] intArr = {2, 4, 6};
		boolean result = Arrays.stream(intArr).allMatch(a->a%2==0);
		System.out.println("모두 짝수 : " +result);
		result = Arrays.stream(intArr).anyMatch(a->a%3==0);
		System.out.println("3의 배수가 존재 : " +result);
		result = Arrays.stream(intArr).noneMatch(a->a%3==0);
		System.out.println("3의 배수가 없니 : " +result);
	}
}