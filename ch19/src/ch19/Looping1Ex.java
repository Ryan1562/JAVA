package ch19;
import java.util.Arrays;
public class Looping1Ex {
	public static void main(String[] args) {
		int[] iArr = {1, 2, 3, 4, 5}; 
//		동작이 되지 않음 peek중간 단계
		Arrays.stream(iArr).filter(i->i%2==0).peek(n->System.out.print(n+", "));
//		실행은 최종 단계가 있어야 한다
		int total = Arrays.stream(iArr).filter(i->i%2==0).peek(n->System.out.print(n+", ")).sum();
		System.out.println("\n합계 : " + total);
//		forEach 최종 단계
		Arrays.stream(iArr).filter(i->i%2==0).forEach(n->System.out.print(n+", "));
	}
}