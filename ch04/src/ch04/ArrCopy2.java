package ch04;
import java.util.Arrays;
public class ArrCopy2 {
	public static void main(String[] args) {
		//             0    1  2    3   4
		int[] arr1 = { 34, 56, 67, 88, 92};
		//                   0  1  2  3  4  5  6  7  8   9
		//                   0  0  0  0  0  0  0  0  0   0
		int[] arr2 = new int[10];
//		               원본 전달시작위치 대상 받기시작위치  갯수
		System.arraycopy(arr1,  0,   arr2, 0, arr1.length);
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = new int[10];
		System.arraycopy(arr1, 2, arr3, 0, arr1.length - 2);
		System.out.println(Arrays.toString(arr3));
		int[] arr4 = new int[10];
		System.arraycopy(arr1, 1, arr4, 4, arr1.length - 1);
		System.out.println(Arrays.toString(arr4));
	}
}