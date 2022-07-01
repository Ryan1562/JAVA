package ch04;

public class Arr5 {
	public static void main(String[] args) {
//		                      0        1     2         3      4 
//		fruits.length : 5 
		String[] fruits = {"산딸기", "집딸기", "판딸기", "죽은딸기","알카리딸기"};
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		System.out.println("===========");
		// 뒤부터 출력 일반 for해야 가능 마지박 인덱스 : fruits.length - 1
		for(int i = fruits.length - 1; i >= 0; i--) {
			System.out.println(fruits[i]);
		}
	}
}