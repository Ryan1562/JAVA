package ch09;
import java.util.Arrays;
public class Str4 {
	public static void main(String[] args) {
//		              0 123 45 6789 01234 56 789 01 2  index 22, 글자수 23
		String str = "우리는 친구였어, 곁에 있으면 든든한 친구";
//		총 글자수
		System.out.println("글자 수 : " + str.length());
//		index 5부터 10바로 앞까지 출력
		System.out.println(str.substring(5, 10));
//		" "을 기준으로 배열을 만들어서 배열 출력
		String[] str1 = str.split(" ");	
		System.out.println(Arrays.toString(str1));
//		배열에서 "는"으로 끝나는 단어 출력
//		    "  "든"으로 시작하는 단어 출력
		for(String s : str1) {
			if (s.endsWith("는")) System.out.println("는으로 끝하는 단어 : " + s);
			if (s.startsWith("든"))  System.out.println("든으로 시작나는 단어 : " + s);
		}
//		,가 있는 인덱스 번호
		System.out.println(",의 index번호 : "+str.indexOf(","));
		System.out.println("======================");
//		글자 뒤집어서 출력 charAt
		for(int i = str.length() - 1; i >= 0; i-- ) {
			System.out.print(str.charAt(i));  // charAt 해당하는 문자 한자 가져오기
		}
	}
}