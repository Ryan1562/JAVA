package ch11;
import java.util.Arrays;
public class Arrays1 {
	public static void main(String[] args) {
		String[] arr1 = {"월요일", "쭈아", "오후지만", "신나"};
		String[] arr2 = Arrays.copyOf(arr1, arr1.length); // 값 복사
		arr1[1] = "대박";
//		인덱스 1부터 3바로 앞
		String[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		String[] arr4 = new String[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
//		저장된 주소가 아니라 배열값 출력
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}
}