package ch04;

public class Args1 {
	public static void main(String[] args) {
		for(int i =0; i < args.length;i++) {
			System.out.println(args[i]);
		}
		System.out.println("=============");
		// 확장 for문 입력된 데이터 출력
		for(String str : args) {
			System.out.println(str);
		}
	}
}