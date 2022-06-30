package ch03;

public class If8 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month==12 || month==1 || month ==2)
			season ="겨울";
		else if (month==3 || month==4 || month == 5)
			season ="봄";
		else if (month>=6 && month <= 9)
			season ="여름";
		else if (month>=9 && month <=11)
			season ="가을";
		else season = "바보아냐 헐 ~ "; 
		System.out.printf("입력한 월은 %d월이며 계절은 %s입니다",month, season);
	}
}
