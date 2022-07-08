package ch06;
public class Person2Ex {
	public static void main(String[] args) {
		Student4 st1 = new Student4();
		st1.setName("제니"); st1.setAge(26); st1.setBan("1반");
		Student4 st2 = new Student4();
		st2.setName("보검"); st2.setAge(28); st2.setBan("2반");
		
		Teacher th1 = new Teacher();
		th1.setName("이준호"); th1.setAge(31); th1.setSubject("자바");
		Teacher th2 = new Teacher();
		th2.setName("로제"); th2.setAge(25); th2.setSubject("JSP");
		
		Manager mg1 = new Manager();
		mg1.setName("준수"); mg1.setAge(45); mg1.setPart("화장실 청소");
		
		st1.printAll(); st2.printAll(); th1.printAll(); th2.printAll(); mg1.printAll();
	}
}