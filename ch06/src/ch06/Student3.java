package ch06;
public class Student3 {
	private String name; private int kor, eng, math;	
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	public int getKor() {		return kor;	}
	public void setKor(int kor) {	this.kor = kor;	}
	public int getEng() {		return eng;	}
	public void setEng(int eng) {		this.eng = eng;	}
	public int getMath() {		return math;	}
	public void setMath(int math) {		this.math = math;	}
	void print() {
		System.out.println("이름 : "+ getName());
		System.out.println("국어 : "+ getKor());
		System.out.println("영어 : "+ getEng());
		System.out.println("수학 : "+ getMath());
		System.out.println("==========================");
	}
}