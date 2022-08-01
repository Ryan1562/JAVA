package ch19;
public class Student2 implements Comparable<Student2>{
	private String name;
	private int score;
	public Student2(String name, int score) {
		this.name = name; this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
//	비교하는 기준
	public int compareTo(Student2 o) {
		return Integer.compare(score, o.score);
	}	
}