package ch09;
public class String1 {
	public static void main(String[] args) {
		String str1 = "java";   // String 기본형처럼 사용
		String str2 = "java";   // intern()메서드를 통하여 상수풀을 사용
		String str3 = new String("java"); // String 참조형처럼 사용
//		==게 같다는 의미는 데이터가 있는 주소가 같다
		if (str1 == str2) System.out.println("str1과 str2가 같다");
		else System.out.println("str1과 str2가 다르다");
		if (str1 == str3) System.out.println("str1과 str3가 같다");
		else System.out.println("str1과 str3가 다르다");
		System.out.println("========================");
//		equals는 주소와 관계없이 내용이 같으면 같다라고 기준을 정했음
		if (str1.equals(str3)) System.out.println("str1과 str2가 같다");
		else System.out.println("str1과 str2가 다르다");
		if (str1.equals(str3)) System.out.println("str1과 str3가 같다");
		else System.out.println("str1과 str3가 다르다");
	}
}