package ch04;

public class SecArr1 {
	public static void main(String[] args) {
		int[][] test = new int[2][3];
		test[0][0] = 100;	test[0][1] = 200;	test[0][2] = 300; // 0행 끝
		test[1][0] = 101;	test[1][1] = 201;	test[1][2] = 301; // 1행 끝
		int sum = 0;
		for(int i = 0; i < test.length;i++) { // test.length 행의 갯수  2
			for (int j = 0; j < test[i].length; j++) { // test[i].length i행의 열의 갯수  3
				System.out.print(test[i][j]+"\t");
				sum += test[i][j];
			}
			System.out.println(sum);
			sum = 0;
		}
		System.out.println("=====================");
		for(int[] t11 : test)  { // {100,200,300} {101,201,301}
			for (int t : t11) {
				System.out.print(t+"\t");
				sum += t;
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}