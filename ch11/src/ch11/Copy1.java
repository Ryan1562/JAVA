package ch11;
import java.util.Arrays;
public class Copy1 {
	public static void main(String[] args) {
		int[] data = {0, 1, 2, 3, 4};
		int[] sCopy=null, dCopy = null;
		sCopy = data;  // 주소를 복사
		dCopy = deepCopy(data);  // 데이터를 복사
		data[0] = 77;
		System.out.println("원본 : "  +Arrays.toString(data));
		System.out.println("sCopy : "+Arrays.toString(sCopy));
		System.out.println("dCopy : "+Arrays.toString(dCopy));
	}
	private static int[] deepCopy(int[] data) {
		int[] result = new int[data.length];
		System.arraycopy(data, 0, result, 0, result.length);
		return result;
	}
}