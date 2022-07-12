package ch08;
public class Employee {
	public final double INCENTIVE_RATE = 0.1; // 10%로 고정
	private String name;
	public Employee() {}
	Employee(String name ) {
		this.name = name;
	}
	public String getName() {			return name;		}
	public void setName(String name) {	this.name = name;	}	
	int computePay() { // 재정의해서 사용해라
		return 0;
	}
	final int computrIncentive() { // 재정의 불가 
		int result = 0;
		int pay = computePay();
		if (pay >= 100000) {
			result = (int)(pay * INCENTIVE_RATE);
		} 
		return result;
	}
}