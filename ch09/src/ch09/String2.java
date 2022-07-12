package ch09;
import java.util.Arrays;
public class String2 {
	public static void main(String[] args) {
//		변수와 변수간에 연산 : 범위가 큰쪽으로 맞춰서 연산
		System.out.println(2+0+2+2+"월드컵");
		System.out.println("월드컵"+2+0+2+2);
		String str1 = "대박";             // 기본형처럼 사용
		String str2 = new String("쪽박"); // 참조형
		char[] ch =  {'화','요','일'};
		String str3 = new String(ch);    // 문자 배열
		System.out.println(str1+str2+str3);
//		split : 기준을 중심으로 데이터를 읽어서 배열로 변경
//		               0 12 3456 7890 1
		String str4 = "오늘은, 화요일, 쭈아";
		String[] str5 = str4.split(", ");
		System.out.println(Arrays.toString(str5));
//		인덱스 2부터 7앞까지(7제외) 일부 추출  substring 데이터 일부 추출
		String str6 = str4.substring(2, 7);
		System.out.println(str6);
//		인덱스 5부터 끝까지
		String str7 = str4.substring(5);
		System.out.println(str7);
	}
}