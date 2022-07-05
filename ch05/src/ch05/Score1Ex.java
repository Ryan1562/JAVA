package ch05;
class Score1 {
//	클래스 밑에 선언한 변수는 여러 메서드에서 같이 사용 가능 -> 전역변수
	String name;        
	int kor, eng, math;
	void print() { // 지역변수 : 해당하는 메서드에서만 사용 가능하고 다른 메서드에서 사용 못함
		int sum = kor+eng+math;  // 메서드 안에서 정의된 변수
		System.out.println(name+"의 성적");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+sum);
		System.out.printf("%.2f\n", (double)sum/3);
		// 평균
		System.out.println("==================");
	}
//	void cal() {
//		System.out.println("국어 : " + kor);
//		System.out.println("총점 : " + sum);  // sum이 지역변수라서 다른 메서드에서는 사용 못함
//	}
}
public class Score1Ex {
	public static void main(String[] args) {
		Score1 st1 = new Score1(); Score1 st2 = new Score1(); Score1 st3 = new Score1(); 
		st1.name = "제니"; st1.kor = 88; st1.eng = 77; st1.math = 99;
		st2.name = "보검"; st2.kor = 77; st2.eng = 66; st2.math = 90;
		st3.name = "로제"; st3.kor = 92; st3.eng = 88; st3.math = 93;
		st1.print(); st2.print(); st3.print();
	}
}