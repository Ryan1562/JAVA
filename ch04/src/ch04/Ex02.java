package ch04;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50};
		// 각각 출력후에 합계
		int sum = 0;
		for (int i =0; i < arr.length;i++) {
			System.out.print(arr[i]+"\t");
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
		sum = 0;
		for(int ar : arr) {
			System.out.print(ar+"\t");
			sum += ar;
		}
		System.out.println("합계 : " + sum);
	}
}