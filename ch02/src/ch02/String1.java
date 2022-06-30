package ch02;

public class String1 {
	public static void main(String[] args) {
//		String 참조형인데 기본형처럼 사용 가능
		String str1 = "산 딸기";
		String str2 = "판 딸기";
		String str3 = str1 + str2;
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		System.out.println("str3 = "+str3);
	}
}