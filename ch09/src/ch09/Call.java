package ch09;

import java.util.Calendar;

public class Call {
	public static void main(String[] args) {
		Calendar call = Calendar.getInstance();
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n", call.get(Calendar.YEAR), call.get(Calendar.MONTH) + 1, call.get(Calendar.DATE));
		System.out.println(call.get(Calendar.DAY_OF_MONTH));
		System.out.println(call.get(Calendar.DAY_OF_YEAR));
		System.out.println(call.get(Calendar.WEEK_OF_MONTH));
		System.out.println(call.get(Calendar.WEEK_OF_YEAR));
	}
}
