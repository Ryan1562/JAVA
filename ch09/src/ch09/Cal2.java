package ch09;
import java.util.Calendar;
public class Cal2 {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		String day = "";
		if (cal1.get(Calendar.HOUR_OF_DAY) > 12) day = "오후";
		else day = "오전";
		System.out.printf("현재 (%s) %d시 %d분 %d초\n", day, cal1.get(Calendar.HOUR),
				cal1.get(Calendar.MINUTE), cal1.get(Calendar.SECOND));
	}
}