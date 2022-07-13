package ch09;

import java.util.Calendar;

public class Cal3 {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		String week = "";
		switch (cal1.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY: week = "일요일"; break;
		case Calendar.MONDAY: week = "월요일"; break;
		case Calendar.TUESDAY: week = "화요일"; break;
		case Calendar.WEDNESDAY: week = "수요일"; break;
		case Calendar.THURSDAY: week = "목요일"; break;
		case Calendar.FRIDAY: week = "금요일"; break;
		case Calendar.SATURDAY: week = "토요일"; break;		
		}
		System.out.println("오늘은 "+week+"입니다");
	}
}
