package ch03;

public class Do1 {
	public static void main(String[] args) {
		int i = 0;
		do { // 조건에 관계없이 일단 한 번은 한다
			System.out.println("안녕");
			i++;
		}while(i < 10);
	}
}