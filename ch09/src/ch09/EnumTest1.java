package ch09;
enum SchoolType { // 임의 데이터 타입 정의
	ELEMENTARY, MIDDLE, HIGH, UNIVERSITY
}
class Student1 {
	SchoolType school;  
	public Student1(SchoolType school) {
		this.school = school;
	}
}
public class EnumTest1 {
	public static void main(String[] args) {
		Student1 st1 = new Student1(SchoolType.ELEMENTARY);
		if (st1.school == SchoolType.ELEMENTARY) System.out.println("초딩");
		SchoolType[] schools = SchoolType.values();
		for(SchoolType school : schools) {
//			                    값           인덱스 번호
			System.out.println(school+" : "+school.ordinal());
		}
	}
}