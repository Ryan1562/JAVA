package ch09;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA","ca", "co", "c.", "c0",
				"car","combat","count", "date", "disc"};
//		[]안에 문자중에 하나
		Pattern p = Pattern.compile("b[a-z]*"); // 첫글자는 c이고 두번째글자는 영(소)문자 여러개
		for (int i =0;i < data.length;i++) {
			Matcher m = p.matcher(data[i]);
			if (m.matches()) {  // 검색 조건에 맞으면
				System.out.println(data[i]+", ");
			}
		}
	}
}