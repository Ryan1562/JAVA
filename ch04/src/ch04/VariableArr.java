package ch04;

public class VariableArr {
	public static void main(String[] args) {
		int[][] score = new int[3][]; // new int[][3] 는 에러
		score[0] = new int[2];
		score[1] = new int[5];
		score[2] = new int[3];
		for(int i = 0; i < score.length;i++) {
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = (int)(Math.random()*45) + 1; // 1 ~ 45까지 rndom한 값
			}
		}
		for(int[] k1 : score) {
			for (int sc : k1) {
				System.out.print(sc+"\t");
			}
			System.out.println();
		}
	}
}
