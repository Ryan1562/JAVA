package ch03;
public class If6 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		if (score >=90)	{
			grade="A";
			if (score > 95) grade += "+";   // 중첩 if
			else grade += "0";
		} else if (score >= 80) {
			grade = "B";
			if (score > 85) grade += "+";   // 중첩 if
			else grade += "0";
		} else if (score >= 70) {
			grade = "C";
			if (score > 75) grade += "+";   // 중첩 if
			else grade += "0";
		} else if (score >= 60) {
			grade = "D";
			if (score >65) grade += "+";   // 중첩 if
			else grade += "0";
		}
		else grade = "F";
		System.out.printf("점수는 %d이고 학점은 %s", score, grade);
	}
}
