package ch04;

public class Ex02 {
	public static void main(String[] args) {
		int[]arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] + "\t");
			sum += arr[i];
		}
		System.out.println();
		System.out.printf("합계 : "+ sum);
	}
}