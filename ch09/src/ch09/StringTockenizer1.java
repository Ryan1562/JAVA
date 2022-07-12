package ch09;
import java.util.StringTokenizer;
public class StringTockenizer1 {
	public static void main(String[] args) {         // 문자열                   delimiter(구분자)
		StringTokenizer st = new StringTokenizer("산딸기,판딸기,죽은딸기,알카리딸기,뱀딸기",",");
		while(st.hasMoreTokens()) { // 토큰이 남아있으면, 문자열을 구분자로 나눌게 남아있니 ?
			System.out.println(st.nextToken()); // 해당하는 다음 토큰을 가지고 와
		}
	}
}