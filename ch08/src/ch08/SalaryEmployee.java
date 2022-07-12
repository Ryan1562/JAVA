package ch08;
public class SalaryEmployee extends Employee {
	private int annualSalary;
	public SalaryEmployee(String name, int annualSalary) {
		super(name); this.annualSalary = annualSalary;
	}
	public int getAnnualSalary() {	return annualSalary;	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	int computePay() {		
		return annualSalary / 12;
	}
//	int computrIncentive() { // 재정의 불가 
//		int result = 0;
//		int pay = computePay();
//		if (pay >= 100000) {
//			result = (int)(pay * INCENTIVE_RATE);
//		} 
//		return result;
//	}
}