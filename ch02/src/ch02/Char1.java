package ch02;

public class Char1 {
	public static void main(String[] args) {
//		%c 문자 %s,  문자열(문자 여러개), \n줄바꿈
//		문자는 작은 따움표 '', 문자열은 큰 따움표""
		System.out.printf("문자 %c의 유니코드는 %d\n", 'A',(int)'A');
		System.out.printf("문자 %c의 유니코드는 %d\n", 'a',(int)'a');
		System.out.printf("문자 %c의 유니코드는 %d\n", '0',(int)'0');
		System.out.printf("문자 %c의 유니코드는 %d\n", 'A'+1,(int)('A'+1));
	}
}