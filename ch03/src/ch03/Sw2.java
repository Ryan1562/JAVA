package ch03;

public class Sw2 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String msg = "";
		switch(num) {
		case 1: msg = "안녕하세요"; break;
		case 2: msg = "반갑습니다"; break;
		case 3: msg = "처음 뵙겠습니다"; break;
		default : msg= "누구세요";
		}
		System.out.println(msg);
	}
}