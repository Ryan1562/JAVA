package ch04;

public class SecArr3 {
	public static void main(String[] args) {
		// 수지 { 99, 66, 88} 평균(소숫점 2자리) 일반 for사용
		// 확장 for문은 이름 출력에 문제가 있음
		int[][] score = {{90, 88, 78},{77, 88, 99}, {55,99, 95},{78,90,67}};
		String[] name = {"제니","보검","로제","은우","수지"};
		int sum = 0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=================================================");
		for(int i = 0; i < score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j =0; j < score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
			}
			System.out.printf("%d\t%.2f\n",sum,(double)sum/score[i].length);
			sum = 0;
		}
		System.out.println("=================================================");
	}
}