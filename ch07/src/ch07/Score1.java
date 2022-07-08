package ch07;
public class Score1 {
	String subject;	String[] name; 	String[] title; int[][] score; 	
	int len, sum = 0; 	int[] tot; 
	public Score1(String subject,String[] name,	String[] title,int[][] score,int len) {
		this.subject = subject; this.name = name; this.title=title; this.score = score; 
		this.len = len; tot = new int[score[0].length];
	}
	public void print() {
		System.out.println(subject);
		System.out.println("=======");
		for(int i =0; i < title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		for(int i = 0; i < len;i++) {
			System.out.print("=");
		}
		System.out.println();
		for(int i =0; i < score.length;i++) {  // i는 행
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length;j++) {  // j는 열
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];    // 행합계
				tot[j] += score[i][j]; // 열합계
			} // printf : print+format %d(decimal)정수 \t(tab) (double)는 sum에 있는 정수값을 double형으로 변경 245.0
			  // %.1f(float) 실수형식으로 소숫점 첫째자리 까지 출력 \n는 줄바꿈
			System.out.printf("%d\t%.1f\n",sum,(double)sum/score[i].length);
			sum = 0;
		}
		for(int i = 0; i < len;i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.print("총계\t");
		for(int j = 0; j < tot.length;j++) {
			System.out.print(tot[j]+"\t");
			sum += tot[j];
		}
		System.out.printf("%d\t%.1f\n",sum,(double)sum/tot.length/name.length);
	}
}