package ch04;

public class Score1 {
	public static void main(String[] args) {
		String subject = "성적표";
		String[] name = {"BTS", "아이유", "유재석", "블랙핑크"};
		String[] title = {"이름", "국어", "영어", "수학", "총점", "평균"};
		int[][] score = {{90, 80, 70}, {76, 86, 90}, {90, 78, 90}, {82, 98, 78}};
		int len = 44, sum= 0;
		int[] tot = new int[score[0].length];
		System.out.println(subject);
		System.out.println("=====");
		for(int i = 0; i < title.length; i++) { 
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < len; i++) { 
			System.out.print("=");
		}
		System.out.println();
		for(int i = 0; i < score.length; i++) { 
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++) { 
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				tot[j] += score[i][j];
			}
			System.out.printf("%d\t%.1f\n", sum,(double)sum/score[i].length);
			sum = 0;
		}
		for(int i = 0; i < len; i++) { 
			System.out.print("=");
		}
		System.out.println();
		System.out.print("총계\t");
		for(int j = 0; j < tot.length; j++) { 
			System.out.print(tot[j] +"\t");
			sum += tot[j];
		}
		System.out.printf("%d\t%.1f\n", sum,(double)sum/tot.length/name.length);
		System.out.println();
	}
}
