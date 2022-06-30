package ch03;

public class Sw1 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		switch (num) { // num에 들어온 숫자와 일치하는 case로 가라
		// break switch 끝내라
		case 1: System.out.println("L"); break;
		case 2: System.out.println("O"); break;
		case 3: System.out.println("V"); break;
		case 4: System.out.println("E"); break;
		default: System.out.println("1,2,3,4중에 하나의 숫자를 입력하세요");
		}
	}
}
