package ch08;
public class EmployeeEx {
	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		emps[0] = new SalaryEmployee("블랙핑크", 2000000);
		emps[1] = new SalaryEmployee("BTS", 5000000);
		emps[2] = new HourlyEmployee("세정", 100,800);
		emps[3] = new HourlyEmployee("수지", 200,20000);
		emps[4] = new HourlyEmployee("모모", 300, 10000);
		
		for(int i =0; i < emps.length; i++) {
			int sal = emps[i].computePay();
			int bonus = emps[i].computrIncentive();
			System.out.println("=== "+emps[i].getName()+"의 금여 명세 ====");
			System.out.println("급여 : " + sal);
			System.out.println("보너스 : " + bonus);
		}
	}
}