package ch03;

public class Continue1 {
	public static void main(String[] args) {
		for(int i =0;i <10;i++) {
			System.out.println("난 반복 "+i);
			if (i > 3) continue; // 아래 문장을 실행하지 읺고 조건에 잇는 증감으로 간다
			System.out.println("나두 "+i);
		}
	}
}
