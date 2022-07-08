package ch07;
public class Student2 extends Person2 {
	private String ban;
	public Student2(String name, int age, String ban) {
		super(name, age); this.ban = ban;		
	}
	public String getBan() {	return ban;	}
	public void setBan(String ban) {	this.ban = ban;	}	
	void print() {
		super.print();
		System.out.println("반 : "+ban);
	}
}
class Teacher2 extends Person2  {
	private String subject;
	public Teacher2(String name, int age, String subject) {
		super(name, age);  this.subject = subject;
	}
	public String getSubject() { 	return subject;	}
	public void setSubject(String subject) {	this.subject = subject;	} 
	void print() {
		super.print();
		System.out.println("과목 : "+subject);
	}
}