package ch04;

public class VariableArr2 {
	public static void main(String[] args) {
		// 가변행열 선언 생성 대입 한번에
		// 행별로 열이 크기가 다를 수 잇는 배열
		int[][] score = {{23,56},{78,88,98,56},{46,75,99}};
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
			}
			System.out.println("합계 : "+sum);
			sum = 0;
		}
	}
}
