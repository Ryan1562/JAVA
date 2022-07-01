package ch04;
public class SecArr2 {
	public static void main(String[] args) {
//		        첫번째     국   영   수 두번째 국 영 수  세번째 국 영 수 네번째 국 영 수
		int[][] score = {{90, 88, 78},{77, 88, 99}, {55,99, 95},{78,90,67}};
		String[] name = {"제니","보검","로제","은우"};
		int sum = 0;
		System.out.println("이름\t국어\t영어\t수학\t총점");
		System.out.println("=====================================");
		// 일반 for문
		for(int i = 0; i < score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j = 0; j < score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
			}
			System.out.println(sum);
			sum = 0;
		}
		System.out.println("=====================================");
	}
}