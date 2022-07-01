package ch03;
public class For01 {
	public static void main(String[] args) {
//		     초기화     조건비교    증감
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+"\t");			
		}
		System.out.println();
		for (int i = 10; i > 0; i--) {
			System.out.print(i+"\t");			
		}
		System.out.println();
		for (int i = 1; i <= 10; i+=2) {
			System.out.print(i+"\t");			
		}
		System.out.println();
		for (int i = 1; i <= 10; i*=2) {
			System.out.print(i+"\t");			
		}
		System.out.println();
		int i = 1;
		for (; ; ) {  // for (; ; )와 while(true)는 같다
			System.out.print(i+"\t");
			if (i > 10) break;
			i++;
		}
		System.out.println();
	}
}