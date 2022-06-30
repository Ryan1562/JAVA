package ch03;

public class Sw7 {
	public static void main(String[] args) {
		int salary = Integer.parseInt(args[0]);
		String grade = "";
		if (salary > 1000000) grade = "A";
		else
		switch((salary - 1)/100000) {
		case 7: case 8: case 9: grade = "B"; break;
		case 5: case 6: grade = "C"; break;
		case 3: case 4: grade = "D"; break;
		default: grade = "F"; 
		}
		System.out.printf("급여는 %d이고 등급은 %s입니다", salary, grade);
	}
}
