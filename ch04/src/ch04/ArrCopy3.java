package ch04;
import java.util.Arrays;
public class ArrCopy3 {
	public static void main(String[] args) {
		String cities[] = {"서울","대구","춘천","울산","광주","천안"};
		String nations[] = new String[]{"대한민국","미국","영국","일본","프랑스"};
		String newArray[] = new String[cities.length + nations.length];
		// cities와 nations데이터를 합쳐서 newArray로 복사하고 출력
		System.arraycopy(cities, 0, newArray, 0, cities.length);
		System.arraycopy(nations, 0, newArray, cities.length, nations.length);
		System.out.println(Arrays.toString(newArray));
		for(int i = 0; i < newArray.length;i++) {
			System.out.print(newArray[i]+" ");
		}
		System.out.println("\n============");
		for(String str : newArray) {
			System.out.print(str+", ");
		}
	}
}