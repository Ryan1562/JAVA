package ch09;
import java.util.Calendar;
public class Cal1 {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
//		월은 0,1,...11로 만듬 +1해야 제대로 된 월
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n",
				cal1.get(Calendar.YEAR), cal1.get(Calendar.MONTH)+1, cal1.get(Calendar.DATE) );
		System.out.println(cal1.get(Calendar.DAY_OF_MONTH)); // 현재 월의 일자
		System.out.println(cal1.get(Calendar.DAY_OF_YEAR));  // 31+28+31+30+31+30+13 1년중 몇일
		System.out.println(cal1.get(Calendar.WEEK_OF_MONTH)); 
		System.out.println(cal1.get(Calendar.WEEK_OF_YEAR));  
	}
}