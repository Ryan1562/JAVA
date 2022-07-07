package ch06;
public class Student3Ex {
	public static void main(String[] args) {
		Student3 stu1 = new Student3();
		stu1.setName("로제"); 
		stu1.setKor(90);
		stu1.setEng(80);
		stu1.setMath(70);
		
		Student3 stu2 = new Student3();
		stu2.setName("보검"); 
		stu2.setKor(99);
		stu2.setEng(77);
		stu2.setMath(66);

		stu1.print();  stu2.print();
	}
}