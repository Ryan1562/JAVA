package ch03;

public class Sw4 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch(month) {
		case 12: case 1 : case 2 :  // 중첩 switch case문장
			switch(month) { // break를 만나면 하나의 switch만 종료
			case 12: season ="초"; break;
			case 1: season ="찐"; break;
			case 2: season ="늦"; 
			}
			season += "겨울"; break; 
		case 3: case 4 : case 5 :  
			switch(month) {
			case 3: season ="초"; break;
			case 4: season ="찐"; break;
			case 5: season ="늦"; 
			}
			season += "봄"; 	break;
		case 6: case 7 : case 8 : 
			switch(month) {
			case 6: season ="초"; break;
			case 7: season ="찐"; break;
			case 8: season ="늦"; 
			}
			season += "여름"; 	break;
		case 9: case 10 : case 11 : 
			switch(month) {
			case 9: season ="초"; break;
			case 10: season ="찐"; break;
			case 11: season ="늦"; 
			}
			season = "가을"; break;
		default : season = "없는 계절"; break;
		}
		System.out.printf("입력한 월은 %d월이고 계절은 %s입니다", month, season);
	}
}
