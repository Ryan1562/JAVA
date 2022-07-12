package ch09;

public class Convert {
	public static void main(String[] args) {
		String str1 = 4 + ""; // 문자열 4로 변경
		String str2 = String.valueOf(4);
		String str3 = "123";
		int i1 = Integer.parseInt(str3); // 정수 3으로 변경
		int i2 = Integer.valueOf(str3);
		int i3 = str3.charAt(0) - '0';
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("i1 : "+i1);
		System.out.println("i2 : "+i2);
		System.out.println("i3 : "+i3);
	}
}
