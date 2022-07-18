package ch11;
// 객체를 정열할 때는 인터페이스 Comparable을 구현하면 된다
public class Member1 implements Comparable<Member1> {
	String name;
	public Member1(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	public int compareTo(Member1 o) {
		return name.compareTo(o.name);
	}
}