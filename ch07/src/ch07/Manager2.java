package ch07;
public class Manager2 extends Person2 {
	private String part;
	public Manager2(String name, int age, String part) {
		super(name, age);  this.part = part;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	void print() {
		super.print();
		System.out.println("담당 : "+part);
	}
	void disp() {
		System.out.println("먹방이 최고지");
	}
}