package ch04;

public class Ex01 {
	public static void main(String[] args) {
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		// 총점, 평균, 최고점, 최저점
		int sum = 0, max = score[0], min = score[0];
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			if (score[i] > max) max = score[i];
			if (score[i] < min) min = score[i];
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/score.length);
		System.out.printf("평균 : %.2f\n",(double)sum/score.length);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}