package ch08;
// aa
/*
 * good
 */
/**
 * author : juni
 * date : 2022. 7
 */
public class Employee {
	public final double INCENTIVE_RATE = 0.1; 
	private String name;
	public Employee() {}
	Employee(String name ) {
		this.name = name;
	}
	public String getName() {			return name;		}
	public void setName(String name) {	this.name = name;	}	
	int computePay() { 
		return 0;
	}
	final int computrIncentive() { 
		int result = 0;
		int pay = computePay();
		if (pay >= 100000) {
			result = (int)(pay * INCENTIVE_RATE);
		} 
		return result;
	}
}