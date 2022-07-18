package ch11;
import java.util.Arrays;
import java.util.Collections;
public class ArrayMember2 {
	public static void main(String[] args) {
		Member2 m1 = new Member2("혜리", 26);
		Member2 m2 = new Member2("재석", 50);
		Member2 m3 = new Member2("은우", 29);
		Member2 m4 = new Member2("하니", 27);
		Member2 m5 = new Member2("보검", 31);
		Member2[] members = {m1, m2, m3, m4, m5};
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println(Arrays.toString(members));
	}
}