package ch11;
public class Member2 implements Comparable<Member2> {
	String name;
	int age;
	public Member2(String name, int age) {
		this.name = name; this.age = age;
	}
	public int compareTo(Member2 o) { // 비교하는 기준을 설정하는 메서드
//		비교는 문자형으로 변경하여 처리
		String age1 = age + ""; 
		String age2 = o.age+"";
		return age1.compareTo(age2);
//		return name.compareTo(o.name);
	}
	public String toString() {
		return name+"("+age+")";
	}
}