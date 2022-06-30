package ch03;

public class Sw3 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch(month) {
		case 12: case 1 : case 2 : season = "겨울"; break;
		case 3: case 4 : case 5 : season = "봄"; break;
		case 6: case 7 : case 8 : season = "여름"; break;
		case 9: case 10 : case 11 : season = "가을"; break;
		default : season = "없는 계절"; break;
		}
		System.out.printf("입력한 월은 %d월이고 계절은 %s입니다", month, season);
	}
}
