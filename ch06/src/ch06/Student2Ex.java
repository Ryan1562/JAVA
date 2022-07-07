package ch06;
class Student2 {
	String name;
	int kor, eng;
	int math;
	Student2(String name, int kor,int eng,int math) {
		this.name=name; this.kor=kor; this.eng=eng; this.math = math;
	}
	int getTotal() {	return kor + eng + math;	}
	float getAverage() { // 
		return getTotal()/(float)3;
	}
	void prn() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + getTotal());
		System.out.printf("평균 : %.2f\n",getAverage());
		System.out.println("==================");
	}
}
public class Student2Ex {
	public static void main(String[] args) {
		Student2 st1 = new Student2("제니", 80, 70, 90);
		Student2 st2 = new Student2("이준호", 90, 88, 77);
		Student2 st3 = new Student2("IU", 90, 88, 99);
		st1.kor=90;   st1.math = 80;
		st1.prn(); st2.prn(); st3.prn();
	}
}

