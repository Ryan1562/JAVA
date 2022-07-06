package ch06;
public class Student {
	String name;	int kor;	int eng;	int math;
	public Student() {	} // 하나라도 생성자가 있으면 자동으로 만들어 주지 않으므로 반드시 있어야 한다
	public Student(String n, int k, int e, int m) {
		name = n; kor = k; eng = e; math = m;
	}
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		return (float)getTotal() / 3;
	}
	void print() {
		System.out.println("===============");
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + getTotal());
		System.out.printf("평균 : %.2f\n", getAverage());
	}
}